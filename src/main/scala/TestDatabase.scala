
// IMPORTS
import java.util.concurrent.TimeUnit.SECONDS

import org.bson.json.JsonMode
import org.bson.json.JsonWriterSettings

import org.mongodb.scala.MongoClient
import org.mongodb.scala.MongoCollection
import org.mongodb.scala.MongoDatabase

// import org.mongodb.scala.MongoCollection
// import org.mongodb.scala.MongoClient

// import org.mongodb.scala.bson.collection.immutable.Document
import org.mongodb.scala.bson.collection.immutable.Document

import scala.concurrent.Await
import scala.concurrent.Future
import scala.concurrent.duration.Duration

import scala.language.postfixOps

import scala.util.Failure
import scala.util.Success
import scala.util.Try

// import org.apache.usergrid.mongo.query

object Database {
  val mongoClient: MongoClient = MongoClient("mongodb://localhost")
  val database:    MongoDatabase = mongoClient.getDatabase("testDB0")

  implicit def printResults() = { }

  def getData() = {
  // val collection:  MongoCollection[Document] = database.getCollection("numbers")
  val collection:  MongoCollection[Document] = database.getCollection("collection1")
  collection.find()
  }

} // object

object TestDatabase extends App {
  val results = Database.getData()
  println(s"$results")

} // object App
