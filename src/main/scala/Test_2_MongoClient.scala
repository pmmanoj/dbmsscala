
// import com.mongodb.async.client.MongoClient
import org.mongodb.scala.bson.collection.immutable.Document
import org.mongodb.scala.{MongoClient, MongoCollection}

object Test_2_MongoClient {

 def main(Args: Array[String] ): Unit = {

  // Two methods to connect:
      // method 1: directly connect to the default server localhost on port 27017
      val mongoClient = MongoClient()
      val mongoDb     = mongoClient.getDatabase("testDB0")

   // method 2: use a Connection String
   //    val mongoClient: MongoClient =

   implicit def printResults() = {

   }

   def getNumbers() = {
     val collection: MongoCollection[Document] = mongoDb.getCollection("numbers")
     /*
     val doc: Document = Document( "_id" -> 0, "name" -> "MongoDB", "type" -> "database",
       "count" -> 1, "info" -> Document("x" -> 203, "y -> 102"))
       */
   }



 } // def-main

} // object
