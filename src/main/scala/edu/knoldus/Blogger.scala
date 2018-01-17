package edu.knoldus

import org.apache.log4j.Logger

case class Blogger(blogList: Map[String, Int]) extends Person {

  def getFavouriteTechnology: String = {

    val log = Logger.getLogger(this.getClass)
    val totalBlogCount = 5
    val updatedBlogList: Map[String, Int] = addFiveBlog(blogList, totalBlogCount)
    log.info(s"updated blog list: $updatedBlogList")
    val favouriteTechnology = updatedBlogList.maxBy(_._2)
    favouriteTechnology._1

  }

  def addFiveBlog(blogList: Map[String, Int], totalBlogCount: Int): Map[String, Int] = {

    if (totalBlogCount > 0) {
      val random = new scala.util.Random
      val blogDomain = blogList.keySet
      val blogTopic = blogDomain.toVector(random.nextInt(blogDomain.size))
      val currentBlogValue = blogList.get(blogTopic)
      val updatedBlogCount = currentBlogValue.get + 1
      val updatedBlogListMap = blogList + (blogTopic -> updatedBlogCount)
      addFiveBlog(updatedBlogListMap, totalBlogCount - 1)
    }
    else {
      blogList
    }

  }

}
