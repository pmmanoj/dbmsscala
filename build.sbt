name := "dbmsScala"

version := "1.0"

scalaVersion := "2.11.8"

// ----- above this line is Intelli-J default configs -----------
/* below this line is what user is customizing */
// add all dependencies with immutable variables

// 2018-01-07: Sanjiv
val MongoDB_Scala_Driver = "2.2.0"



/* Now build your library */
libraryDependencies ++= Seq(
  "org.mongodb.scala" % "mongo-scala-driver_2.12" % MongoDB_Scala_Driver
)


// ==================== REF Notes Below ====================

/*
REF URL: https://stackoverflow.com/questions/37958158/build-sbt-how-to-add-spark-dependencies
Here is a build.sbt that fixes both problems:

name := "hello"

version := "1.0"

scalaVersion := "2.11.8"

val sparkVersion = "1.6.1"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" %% "spark-streaming-twitter" % sparkVersion
)
You also don't need to manually add twitter4j dependencies since they are added transitively by spark-streaming-twitter.

 */
        