package com.shenfeng.yxw.course9

import java.sql.{Driver, DriverManager, Connection}


/**
  * @Author yangxw
  * @Date 2020-10-10 上午8:32
  * @Description
  * @Version 1.0
  */
object MysqlApp {

  def main(args: Array[String]): Unit = {
    val url = "jdbc:mysql://localhost:3306/yxw"
    val username = "root"
    val password = "123456"

    var connection: Connection = null
    try {
      // make the connection
      classOf[com.mysql.jdbc.Driver]

      connection = DriverManager.getConnection(url, username, password)
      val statement = connection.createStatement()
      val resultSet = statement.executeQuery("select * from t_user")
      while (resultSet.next()) {
        val name = resultSet.getString("name")
        val amount = resultSet.getString("amount")
        println(s"$name,$amount")
      }
    } catch {
      case e: Exception => e.printStackTrace()
    } finally {
      if (connection != null) {
        connection.close()
      }
    }


  }
}
