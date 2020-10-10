package com.shenfeng.yxw.course7

/**
  * @Author yangxw
  * @Date 2020-10-09 下午4:48
  * @Description
  * @Version 1.0
  */
object FunctionApp extends App {

  //  def sayHello(name: String) = {
  //    println("Hi " + name)
  //  }
  //
  //  sayHello("cc")

  // 匿名函数
  val m1 = (x: Int) => x + 1
  m1(10)

  def add = (x: Int, y: Int) => {
    x + y
  }

  println(add(2, 3))

  // 将原来接收两个参数的一个函数，转换成2个
  def sum2(a: Int)(b: Int) = a + b

  println(sum2(2)(3))


}
