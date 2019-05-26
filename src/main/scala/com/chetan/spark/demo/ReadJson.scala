package com.chetan.spark.demo

import org.apache.spark.sql.SparkSession

object ReadJson {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder()
      .master("local")
      .appName("Json-Read-test")
      .getOrCreate()

    val jsonInputDF = spark.read.json("/Users/chetanrautela/Desktop/spark-tests/Grade.json")

    println (jsonInputDF.printSchema())
    jsonInputDF.show()

   // val rdd = jsonInputDF.withColumn("tmp",)


  }
}
