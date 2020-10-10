package com.shenfeng.yxw.course7

/**
  * @Author yangxw
  * @Date 2020-10-09 下午4:43
  * @Description
  * @Version 1.0
  */
object StringApp extends App {


  val s = "Hello:PK"
  val t = "cc"
  val name = "OK"
  println(s + name)

  println(s"Hello:${name}")
  val team = "AC milan"

  // 插值
  println(s"Hello:$name,Welcome to $team")

  // 多行字符串
  val z =
    """
      |这是一个多行字符串
      |hello
      |world
      |PK
    """.stripMargin

  println(z)

}
