package com.shenfeng.yxw.course7

/**
  * @Author yangxw
  * @Date 2020-10-09 下午4:55
  * @Description
  * @Version 1.0
  */
object HighFunctionApp extends App {


  val l = List(1, 2, 3, 4, 5, 6, 7, 8)
  // 1、map: 逐个去操作集合中的每个元素
  // 入参：每个函数，每个参数+1
  l.map((x: Int) => x + 1)

  l.map((x) => x * 2)
  // 1个元素可以省
  l.map(x => x * 2)

  l.map(_ * 2).foreach(println)

  println("~~~~~~filter~~~~~~")

  // 2、filter >8
  l.map(_ * 2).filter(_ > 8).foreach(println)

  // 取前N个元素
  l.take(4)
  l.take(2)

  // 3、reduce，规约操作，默认是reduceLeft
  // 两两相+   1+2=3 3+3=6 6+4=10...
  l.reduce(_ + _)

  // 两两相减,
  l.reduce(_ - _)

  l.reduceLeft(_ - _)
  l.reduceRight(_ - _)

  // 初始因子
  l.fold(0)(_ - _)
  l.foldLeft(0)(_ - _)
  l.foldRight(0)(_ - _)


  l.max
  l.min
  l.sum

  // 压扁
  val f = List(List(1, 2), List(3, 4), List(5, 6))
  f.flatten

  // flatMap:
  // flatten:
  f.map(_.map(_ * 2))
  f.flatMap(_.map(_ * 2))

  val txt = scala.io.Source.fromFile("D:\\yangxw\\work\\my_project\\scala\\scala-train\\data\\a.txt").mkString
  println(txt)
  val hh = List(txt)
  // https://blog.csdn.net/qq_44884269/article/details/89520994
  val res = hh.flatMap(_.split(",")).map((_, 1)).groupBy((_._1)).map(t => (t._1, t._2.size))

  println(res)
  //  hh.flatMap(_.split(",")).map(x => (x, 1)).foreach(println)
  //
  //  hh.flatMap(_.split(",")).map(x => (x, 1)).groupBy(_._1).foreach(println)
  //
  //  // 打散，变成一个List
  //  hh.flatMap(_.split(","))
  //
  //  // 转成元组
  //  hh.flatMap(_.split(",")).map((_, 1))
  //
  //  // 分组
  //  hh.flatMap(_.split(",")).map((_, 1)).groupBy((_._1))
  //  // 统计
  //  hh.flatMap(_.split(",")).map((_, 1)).groupBy((_._1)).map(t => (t._1, t._2.size))

}
