package com.shenfeng.yxw.course9

import java.io.FileInputStream

import scala.xml.XML

/**
  * @Author yangxw
  * @Date 2020-10-10 上午8:45
  * @Description
  * @Version 1.0
  */
object XmlApp {
  def main(args: Array[String]): Unit = {
//    loadXML()
    readXmlAttribute()
  }

  def loadXML() = {
    // val xml = XML.load(this.getClass.getClassLoader.getResource("books.xml"))

    val xml = XML.load(new FileInputStream("D:\\yangxw\\work\\my_project\\scala\\scala-train\\src\\main\\resources\\books.xml"))


    println(xml)


  }


  def readXmlAttribute()={
    val xml = XML.load(this.getClass.getClassLoader.getResource("books.xml"))
//    val name  =xml \ "symbols" \ "symbol"
    val fileds  =xml \\ "units"
    println(fileds)
  }
}
