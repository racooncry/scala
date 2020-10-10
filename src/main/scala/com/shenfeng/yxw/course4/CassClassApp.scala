package com.shenfeng.yxw.course4

/**
  * @Author yangxw
  * @Date 2020-10-09 上午11:45
  * @Description 通常用在模式匹配里面
  * @Version 1.0
  */
object CassClassApp {

  def main(args: Array[String]): Unit = {
    println(Dog("cc").name)
  }
}

// case class不用new
case class  Dog(name:String)
