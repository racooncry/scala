package com.shenfeng.yxw.course8

import java.io.File

/**
  * @Author yangxw
  * @Date 2020-10-10 上午8:09
  * @Description
  * @Version 1.0
  */
object ImplicitAspect extends App {
  // 隐式转换函数
  implicit def man2superman(man: Man): Superman = new Superman(man.name)
  implicit def file2RichFile(file: File): RichFile = new RichFile(file);
}
