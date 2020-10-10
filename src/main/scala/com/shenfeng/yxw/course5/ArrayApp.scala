package com.shenfeng.yxw.course5

/**
  * @Author yangxw
  * @Date 2020-10-09 下午1:45
  * @Description
  * @Version 1.0
  */
object ArrayApp extends App {

  val a = new Array[String](5)
  a.length
  // 赋值
  a(0) = "world"
  a(1) = "hello"
  // 取值
  a(1)
  // apply,object
  val b = Array("T", "A", "S")
  val c = Array(2, 3, 4, 5, 6, 7, 8, 9)
  c.sum
  c.min
  c.max
  c.mkString
  c.mkString(",")
  c.mkString("<", ",", ">")

  // 可变的数组
  val p = scala.collection.mutable.ArrayBuffer[Int]()
  p += 1
  // 添加一个
  p += 2
  // 添加若干个
  p += (3, 4, 5)
  // 插入数组
  p ++= Array(6, 7, 8)
  // 指定位置插入
  p.insert(0, 0)
  // 指定位置删除
  p.remove(1)
  // 从下标位置开始删N个
  p.remove(0, 3)
  // 从尾巴开始删N个
  p.trimEnd(2)
  // 可变的转化为不可变的
  p.toArray

  for (i <- 0 until p.length) {
    println(p(i))
  }
  for (ele <- p) {
    println(ele)
  }
  // 逆序输出
  for (i <- (0 until p.length).reverse) {
    println(p(i))
  }
}
