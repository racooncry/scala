package com.shenfeng.yxw.course4

/**
  * @Author yangxw
  * @Date 2020-10-09 上午10:54
  * @Description
  * @Version 1.0
  */
object ConstructApp {
  def main(args: Array[String]): Unit = {
    //    val person = new Person("zhangsan", 30)
    //    println(person.name + " : " + person.age + " : " + person.gender)
    //
    //
    //    val person2 = new Person("zhangsan", 30, "sex")
    //    println(person2.name + " : " + person2.age + " : " + person2.gender)
    val student = new Student("cc", 10, "sexx")
    println(student.name + " : " + student.age + " : " + student.major)
    println(student)
  }

}

// 主构造器
class Person(val name: String, val age: Int) {
  println("Person Constructor enter...")
  val school = "ustc"
  var gender: String = _
  println("Person Constructor leave...")

  // 附属构造器
  def this(name: String, age: Int, gender: String) {
    // 附属构造器的第一行代码必须要带哦用著构造器或者其他附属构造器
    this(name, age)
    this.gender = gender
  }


}

class Student(name: String, age: Int, var major: String) extends Person(name, age) {
  println("Student Constructor leave...")

  override def toString: String = "over to string"
  override val school = "haf"

}