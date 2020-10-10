package com.shenfeng.yxw.course6

import com.shenfeng.yxw.course6.MatchApp.CTO

import scala.util.Random

/**
  * @Author yangxw
  * @Date 2020-10-09 下午3:51
  * @Description
  * @Version 1.0
  */
object MatchApp extends App {

  val names = Array("Akiho Yoshizawa", "YuiHatano", "Aoi Sola")
  val name = names(Random.nextInt(names.length))

  name match {
    case "Akiho Yoshizawa" => println("吉老师")
    case "YuiHatano" => println("波老师")
    case _ => println("不知道")
  }

  def judgeGrade(grade: String) = {
    grade match {
      case "A" => println("1")
      case "B" => println("2")
      case "C" => println("3")
      case "D" => println("4")
      case _ => println("5")
    }
  }

  judgeGrade("A")
  judgeGrade("D")
  judgeGrade("F")


  def judgeGrade(name: String, grade: String) = {
    grade match {
      case "A" => println("1")
      case "B" => println("2")
      case "C" => println("3")
      case "D" => println("4")
      case _ if (name == "lisi") => println(name + ",5")
      case _ => println("nothing")
    }
  }

  judgeGrade("zhangsan", "D")
  // 双重过滤
  judgeGrade("lisi", "A")
  judgeGrade("lisi", "F")


  println("~~~~~~~~~~~~~~~~~Array~~~~~~~~~~~~~~~~~~~~~")

  def greeting(array: Array[String]) = {
    array match {
      case Array("zhnagsan11") => println("Hi:zhnagsan")
      case Array(x, y) => println("Hi:" + x + "," + y)
      case Array("zhnagsan", _*) => println("Hi:zhnagsan and other friends")
      case _ => println("Hi: everybody")
    }
  }


  greeting(Array("zhnagsan"))
  greeting(Array("zhnagsan", "lisi"))
  greeting(Array("zhnagsan", "lisi", "wangwu"))
  greeting(Array("zhnagsan"))


  println("~~~~~~~~~~~~~~~~~List~~~~~~~~~~~~~~~~~~~~~")

  def greeting(list: List[String]) = {
    list match {
      case "zhnagsan" :: Nil => println("Hi:zhnagsan")
      case x :: y :: Nil => println("Hi:" + x + "," + y)
      case "zhangsan" :: tail => println("Hi:zhnagsan and other friends")
      case _ => println("Hi: everybody")
    }
  }

  greeting(List("zhnagsan"))
  greeting(List("zhnagsan", "Lisi"))


  println("~~~~~~~~~~~~~~~~~Any~~~~~~~~~~~~~~~~~~~~~")

  def matchType(obj: Any) = {
    obj match {
      case x: Int => println("Int")
      case s: String => println("String")
      case m: Map[_, _] => m.foreach(println)
      case _ => println("other body")
    }
  }

  matchType(1)
  matchType(Map("name" -> "peak"))

  println("~~~~~~~~~~~~~~~~~case class~~~~~~~~~~~~~~~~~~~~~")

  def caseClassMatch(person: Person) = {
    person match {
      case CTO(name, floor) => println("Cto name is " + name + " , floor is " + floor)
      case Employee(name, floor) => println("Employee name is " + name + " , floor is " + floor)
      case _ => println("other")
    }
  }

  class Person

  case class CTO(name: String, floor: String) extends Person

  case class Employee(name: String, floor: String) extends Person

  case class Other(name: String, floor: String) extends Person

  caseClassMatch(CTO("PK", "22"))
  caseClassMatch(Employee("PK", "22"))
  caseClassMatch(Other("PK", "22"))
}
