package com.shenfeng.yxw.course4

/**
  * @Author yangxw
  * @Date 2020-10-09 上午11:29
  * @Description
  * @Version 1.0
  */
object AbstractApp {

  def main(args: Array[String]): Unit = {
    val student = new Student2()

  }
}

/**
  * 类的一个或者多个方法没有完整的实现（只有定义，没有实现）
  **/
abstract class Person2 {
  def speak

  val name: String
  val age: Int
}

class Student2 extends Person2 {
  override def speak: Unit = println("cc")

  override val name: String = "yxw"
  override val age: Int = 10
}