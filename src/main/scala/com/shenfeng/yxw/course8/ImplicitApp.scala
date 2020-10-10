package com.shenfeng.yxw.course8

import java.io.File
//import ImplicitAspect._

/**
  * @Author yangxw
  * @Date 2020-10-10 上午8:02
  * @Description
  * @Version 1.0
  */
object ImplicitApp extends App {

  //  import ImplicitAspect.man2superman
  //  val man = new Man("PK")
  //  man.fly()
  //
  //
  //  val file = new File("D:\\yangxw\\work\\my_project\\scala\\scala-train\\data\\a.txt")
  //  file.read()
  implicit val test = "test"
  def testParam(implicit name: String) = {
    println(name + "...")
  }
  testParam
  testParam("zhangsan")
//
//
//  implicit val name = "implicit_name"
//  testParam
//  testParam("PK")

//  implicit val s1 = "s1"
//  implicit val s2 = "s2"
//  testParam
}

class Man(val name: String) {
  def eat() = {
    println(s"man [ $name ] eat...")
  }
}

class Superman(val name: String) {
  def fly() = {
    println(s"superman[ $name ] fly...")
  }
}


class RichFile(val file: File) {
  def read() = {
    val text = scala.io.Source.fromFile(file.getPath).mkString
    println(s"File content: $text")
  }
}