package com.shenfeng.yxw.course4

/**
  * @Author yangxw
  * @Date 2020-10-09 上午11:33
  * @Description
  * @Version 1.0
  */
object ApplyApp {

  def main(args: Array[String]): Unit = {
    //    for (i <- 1 to 10) {
    //      ApplyTest.incr
    //    }
    //    // 10 说明object本身就是一个单例对象
    //    println(ApplyTest.count)
    // ==> object.apply
    val b = ApplyTest()

    println("~~~~~~~~")
    val c = new ApplyTest()
    c()
    // 类名() => object.apply
    // 对象名() => class.apply
  }
}

/**
  * 半生类和伴生对象
  * 如果有一个 class 还有一个与class同名的object
  * 那么这个object就是这个class的伴生对象，class是这个object的伴生类
  */
class ApplyTest {
  def apply() = {
    println("class apply...")
  }
}

object ApplyTest {
  println("apply begin")
  var count = 0

  def incr = {
    count = count + 1
  }

  // 最佳实践：在object的apply方法中去new Class
  def apply(): ApplyTest = {
    println("Object apply...")
    new ApplyTest
  }

  println("apply end")
}
