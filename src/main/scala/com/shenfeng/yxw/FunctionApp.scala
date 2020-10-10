package com.shenfeng.yxw

/**
  * @Author yangxw
  * @Date 2020-10-09 上午9:46
  * @Description
  * @Version 1.0
  */
object FunctionApp {

  def main(args: Array[String]): Unit = {

    val res = add(3, 5)
    println(res)
    println(three)
    println(three("yxw"))
    sayHello

    // 默认参数
    sayName()
    sayName("cc")

    // 命名参数
    println(speed(100, 10))
    println(speed(distance = 100, time = 10))
    println(speed(time = 10, distance = 200))

    // 可变参数
    println(sum(1, 2, 3))

    //  条件表达式
    //    val x = 1
    //    if (x > 0) {
    //      true
    //    } else {
    //      false
    //    }

    // 循环表达式
    // 1-10
    1 to 10
    1.to(10)
    // 步长1,1-9
    Range(1, 10)
    // 步长2,10-9
    Range(1, 10, 2)

    // 10-2,步长-1
    Range(10, 1, -1)

    // 1-9
    1 until 10
    1.until(10)

    for (i <- 1 to 10 if i % 2 == 0) {
      println(i)
    }

    val courses = Array("Hadoop", "Spark")
    for (course <- courses) {
      println(course)
    }

    // => 将左边的元素作用上一个函数，变成另外一个结果
    // println 就是作用到course上的一个函数
    courses.foreach(course => println(course))

    // 100个数字，和是0
    var (num, sumAll) = (100, 0)
    while (num > 0) {
      sumAll += num
      num = num - 1
    }
    println(sumAll)
  }

  def add(x: Int, y: Int): Int = {
    // 最后一行就是返回值,不需要return
    x + y
  }

  def three() = "123"

  def three(s: String) = s + s

  def sayHello(): Unit = {
    println("xx")
  }

  // 默认函数
  def sayName(name: String = "PK"): Unit = {
    println(name)
  }

  def speed(distance: Int, time: Int): Float = {
    distance / time
  }


  // 可变参数
  def sum(numbers: Int*): Int = {
    var result = 0
    for (number <- numbers) {
      result += number
    }
    result
  }


}
