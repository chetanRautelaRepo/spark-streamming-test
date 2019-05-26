package com.chetan.spark.demo

import org.apache.spark.sql.SparkSession

/**
 * Hello world!
 *
 */
object App  {
  def main(args: Array[String]): Unit = {
    println( "Hello World!" )

     val sparkSession = SparkSession.builder()
       .appName("Demo-application")
       .master("local[*]")
       .getOrCreate()

    val csvFileDF = sparkSession.read
      .option("header","true")
      .csv("/Users/chetanrautela/Desktop/spark-tests/abc.csv")
    println(csvFileDF.count())
    println(csvFileDF.printSchema())
    csvFileDF.show()
  }

}
