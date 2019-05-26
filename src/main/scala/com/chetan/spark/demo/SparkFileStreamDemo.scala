package com.chetan.spark.demo

import org.apache.spark.sql.SparkSession
import org.apache.spark.streaming.{Duration, StreamingContext}

object SparkFileStreamDemo {

  def main(args: Array[String]): Unit = {

  val spark = SparkSession.builder()
    .master("local[*]")
    .appName("SparkFileStreamDemo")
    .getOrCreate()

    val sc = spark.sparkContext

    val ssc = new StreamingContext(sc,Duration.apply(100))

    ssc.textFileStream("/Users/chetanrautela/Desktop/spark-tests/").count()

  //spark.readStream.textFile("/Users/chetanrautela/Desktop/spark-tests/abc.csv").printSchema()
  }
}
