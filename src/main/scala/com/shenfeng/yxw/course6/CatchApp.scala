package com.shenfeng.yxw.course6

/**
  * @Author yangxw
  * @Date 2020-10-09 下午4:29
  * @Description
  * @Version 1.0
  */
object CatchApp extends App {
  // file  path
  try {
    // open file
    // use file
    val i = 10 / 0
    println(i)
  } catch {
    case e: ArithmeticException => println("除数不能为0")
    case e: Exception => println(e.getMessage)
  } finally {
    // 释放资源，一定执行
    // file.close
  }


}
