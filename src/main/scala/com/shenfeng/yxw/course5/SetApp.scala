package com.shenfeng.yxw.course5

/**
  * @Author yangxw
  * @Date 2020-10-09 下午2:10
  * @Description 数组不重复
  * @Version 1.0
  */
object SetApp extends App {

  val set = Set(1, 2, 2, 3, 4, 5)

  println(set.mkString)

  val set2 = scala.collection.mutable.Set[Int]()
  set2 += 1
}
