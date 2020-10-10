package com.shenfeng.yxw.course5

/**
  * @Author yangxw
  * @Date 2020-10-09 下午2:43
  * @Description
  * @Version 1.0
  */
object OptionApp extends App {

  val map = Map(1 -> 2)

  println(map.get(1).get)
  println(map.get(2))

  println(map.get(1).getOrElse("None"))

  println(map.get(2).getOrElse("Nonec"))

}

