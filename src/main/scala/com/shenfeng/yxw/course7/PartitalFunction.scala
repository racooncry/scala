package com.shenfeng.yxw.course7

import scala.util.Random

/**
  * @Author yangxw
  * @Date 2020-10-09 下午5:58
  * @Description 偏函数: 被包在花括号内没有match的一组case语句
  * @Version 1.0
  */
object PartitalFunction extends App {

  val names = Array("Akiho Yoshizawa", "YuiHatano", "Aoi Sola")
  val name = names(Random.nextInt(names.length))

  name match {
    case "Akiho Yoshizawa" => println("吉老师")
    case "YuiHatano" => println("波老师")
    case _ => println("不知道")
  }

  // A 输入
  // B 输出
  def sayChinese: PartialFunction[String, String] = {
    case "Akiho Yoshizawa" => "吉老师"
    case "YuiHatano" => "波老师"
    case _ => "不知道"
  }

  println(sayChinese("YuiHatano"))
}
