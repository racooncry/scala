package com.shenfeng.yxw.course5

/**
  * @Author yangxw
  * @Date 2020-10-09 下午2:19
  * @Description
  * @Version 1.0
  */
object MapApp extends App {
  var map = Map[String, String]("name" -> "json", " age " -> "22")
  map += ("city" -> "北京")
  println(map)
  val map2 = Map[String, String]("sex" -> "男", "brand" -> "apple")
  val map3 = scala.collection.mutable.Map[String, String]()
  // 添加单个元素
  map3 += ("test" -> "能添加吗")
  // 更新
  map3 += ("test" -> "改变了")
  // 添加多个元素
  map3 += ("success" -> "添加成功了吗", "author" -> "另外一个")
  // 返回所有的key
  println(map3.keys)
  // 返回所有的value
  println(map3.values)
  // 当map为空时,返回true
  println(map3.isEmpty)
  // 合并两个map
  var combine_map = map ++ map2
  // 删除指定的key
  combine_map -= ("city", "name")
  println(combine_map.get("sex").get)
  println(combine_map)
  // 返回所有元素，除了最后一个
  println(combine_map.init)
  // 查找最大元素
  println(combine_map.max)
  // 查找最小元素
  println(combine_map.min)
  // 集合所有元素作为字符串显示
  println(combine_map.mkString(""))
  // 根据key取value值,如果不存在返回后面的值
  combine_map.get("test_101").getOrElse("不存在")


  val keySet = combine_map.keys
  // 遍历,迭代map
  val key_iter = keySet.iterator
  while (key_iter.hasNext) {
    val key = key_iter.next
    println(key + ":" + combine_map.get(key).get)
  }
  // 返回指定键的值，如果不存在返回 Map 的默认方法
  println(combine_map.apply("brand"))

  // 如果map中存在指定 key,返回 true，否则返回 false
  println(combine_map.contains("test_key"))

  // 计算满足指定条件的集合元素数量
  val age_count = combine_map.count(x => {
    x._1.equals("age")
  })


  println(age_count) // 打印结果为1
  val drop_map = combine_map.drop(1) //返回丢弃最后n个元素新集合
  println(drop_map) // 打印结果为:Map(brand -> apple, sex -> 男)
  println(combine_map.empty) // 返回相同类型的空map
  println(map.equals(map2)) // 如果两个 Map 相等(key/value 均相等)，返回true，否则返回false


  // 判断集合中指定条件的元素是否存在
  println(combine_map.exists(x => {
    x._2.equals("男")
  }))
  // 返回满足指定条件的所有集合,结果为:Map(brand -> apple)
  println(combine_map.filter(x => {
    x._1.length > 4
  }))
  // 返回符合指定条件的不可变 Map
  println(combine_map.filterKeys(x => {
    x.equals("test_100")
  }))
  // 查找集合中满足指定条件的第一个元素
  println(combine_map.find(x => {
    x._1.equals(x._2)
  }))
  // 循环map里的所有元素
  combine_map.foreach(x => {
    println(x + "------------")
  })
}
