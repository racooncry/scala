package com.shenfeng.yxw.course9

import scala.io.Source

/**
  * @Author yangxw
  * @Date 2020-10-10 上午8:24
  * @Description
  * @Version 1.0
  */
object FileApp {
  def main(args: Array[String]): Unit = {
    val file = Source.fromFile("D:\\yangxw\\work\\my_project\\scala\\scala-train\\data\\a.txt")(scala.io.Codec.UTF8)

    def readLine() = {
      val lines = file.getLines()
      for (line <- lines) {
        println(line)
      }
    }

    //  readLine()


    def readChar() = {
      for (ele <- file) {
        println(ele)
      }
    }

    // readChar()


    def readNet() = {
      val file = Source.fromURL("http://www.baidu.com")
      for (line <- file.getLines()) {
        println(line)
      }
    }

    readNet()
  }
}
