package edu.knoldus

import org.apache.log4j.Logger

case class Blogger(blogList: Map[String, Int]) extends Person {

  def getFavouriteTechnology: String = {
    val log = Logger.getLogger(this.getClass)
    val newBlogNumber = 5
    val updatedBlogList: Map[String, Int] = addFiveBlogs(blogList, newBlogNumber)
    log.info(s"updated blog list: $updatedBlogList")
    val favouriteTechnology = updatedBlogList.maxBy(_._2)
    favouriteTechnology._1
  }

  def addFiveBlogs(blogList: Map[String, Int], count: Int): Map[String, Int] = {
    if (count > 0) {
      val random = new scala.util.Random
      val blogDomain = blogList.keySet
      val blogTopic = blogDomain.toVector(random.nextInt(blogDomain.size))
      val currentBlogValue = blogList.get(blogTopic)
      val c = currentBlogValue.get + 1
      val newMap = blogList - blogTopic + (blogTopic -> c)
      addFiveBlogs(newMap, count - 1)
    }
    else {
      blogList
    }
  }

}
