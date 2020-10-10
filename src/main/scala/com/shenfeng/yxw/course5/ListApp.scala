package com.shenfeng.yxw.course5

/**
  * @Author yangxw
  * @Date 2020-10-09 下午1:50
  * @Description
  * @Version 1.0
  */
object ListApp extends App {
  // 定长
  val l = List(1, 2, 3, 4, 5)
  // 头
  l.head
  // 除头的所有
  l.tail

  // l是一个元素，NIl空的集合
  val l2 = 1 :: Nil
  val l3 = 2 :: l2

  val l4 = 1 :: 2 :: 3 :: Nil


  val l5 = scala.collection.mutable.ListBuffer[Int]()
  l5 += 2
  l5 += (3, 4, 5)
  l5 ++= List(6, 7, 8, 9)
  l5 -= 2
  l5 -= 3
  l5 -= (1, 4)
  l5 --= List(6, 7, 8)
  println(l5)

  l5.toList
  l5.toArray

  l5.isEmpty
  l5.head
  l5.tail
  l5.tail.head

  def sum(nums: Int*): Int = {
    if (nums.length == 0) {
      0
    } else {
      nums.head + sum(nums.tail: _*)
    }
  }

  println(sum())
  println(sum(1, 2, 3, 4))
}
