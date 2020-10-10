package com.shenfeng.yxw.course5

/**
  * @Author yangxw
  * @Date 2020-10-09 下午2:55
  * @Description
  * @Version 1.0
  */
object TupleApp extends App {

  val tuple = (1, 1.1f, "ff")

  val s = tuple._1 + tuple._2 + tuple._3
  println(s)

  // 迭代元组
  tuple.productIterator.foreach { i => println("Value = " + i) }

  // 元组转字符串
  tuple.toString()

  // 翻转元组
  var t2 = new Tuple2(1, 3)
  t2.swap
}
