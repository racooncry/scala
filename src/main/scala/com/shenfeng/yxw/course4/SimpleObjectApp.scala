package com.shenfeng.yxw.course4

/**
  * @Author yangxw
  * @Date 2020-10-09 上午10:43
  * @Description
  * @Version 1.0
  */
object SimpleObjectApp {

  def main(args: Array[String]): Unit = {
    val person = new People()
    person.name = "Jack"
    println(person.name + " .. " + person.age)
    println("invoke eat:" + person.eat())

    person.personInfo()
  }
}

class People {
  // 定义属性,占位符
  var name: String = _
  val age: Int = 10

  // 只允许类内部使用
  private[this] val gender = "male"

  def personInfo() = {
    println("gender:" + gender)
  }

  def eat(): String = {
    name + "eat.."
  }

  def watchFootball(teamName: String) = {
    println("teamName:" + teamName)
  }
}

