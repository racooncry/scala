package com.shenfeng.yxw.course8

/**
  * @Author yangxw
  * @Date 2020-10-10 上午8:19
  * @Description
  * @Version 1.0
  */
object ImplicitClassApp extends App {

  // 对于参数int类型都有add方法
  implicit class Caculator(x: Int) {
    def add(a: Int) = {
      x + a
    }
  }
  println(1.add(3))
}


