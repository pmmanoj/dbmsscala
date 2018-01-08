
import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by sanjivsingh on 1/7/18.
  * per instructions sourced from: https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=6&ved=0ahUKEwjn7qm9ssbYAhVi7oMKHQsNAKsQFghNMAU&url=https%3A%2F%2Fwww.ibm.com%2Fdeveloperworks%2Fcommunity%2Ffiles%2Fbasic%2Fanonymous%2Fapi%2Flibrary%2Fe5c0146d-f723-446b-9151-c31d4c56ed01%2Fdocument%2Fb41505ac-141b-45a2-84cd-1b6a8d5ae653%2Fmedia&usg=AOvVaw1LhuOSmCX2H5SmlJLLHVf7
  * REF URL: file:///Users/sanjivsingh/Documents/EVAYA/NASTY_docs/NASTY_Spark_Setup_IdeaJ.pdf
  *
  */

object Test_1_ScalaSpark {

  def main(args: Array[String]) : Unit = {

    // configure name and number of Spark Executors
    val conf = new SparkConf()
    conf.setAppName("Data Sets Test")
    conf.setMaster("local[4]")

    /*
     Obtain a SparkContext (into which you will 'push' your data and code for distribution across
     configured number of Spark Executors (line 19) = 4 count; note: for obtaining max executors
     use conf.setMaster( "local[*]" )
    */
    val sc = new SparkContext(conf)
    println(sc)

  } // def-main

} // object
