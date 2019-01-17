package scala

import Array._
import scala.util.matching.Regex

case class CaseClass(a: Int, b: Int)//只是常规类，默认情况下是不可变的,  类中列出的所有参数默认使用public和immutable修辞符

object Demo {

  def layout[A](x: A) = "[" + x.toString() + "]"

  def apply(f: Int => String, v: Int) = f(v)

  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }

  def main(args: Array[String]): Unit = {
//    println("hello world!")
//    var a = 0
//    val numList = List(1,2,3,4,5,6,7,8,9,10)
//
//    var retVal = for {a <- numList if a != 3; if a < 8}yield a
//
//    for (a <- retVal){
//      println("Value of a: " + a)
//    }
    var inc = (x: Int) => x + 1
//    println(Array.apply(1, 2,3))
//    val fruit1 = "apples"::("oranges"::("pears"::Nil))
//    val fruit2 = "mangoes"::("banana"::Nil)
//    var fruit = fruit1:::fruit2
//    var fruitw = fruit1.:::(fruit2)
//    val squar = List.tabulate(6)(n => n * n)
//    val colors = Map("red" -> "#FF", "azur" -> "#MM", "peru" -> "#SS")
//    colors.keys.foreach{
//      i => println("Key = " + i)
//        println(" value = " + colors(i))
//    }
//    val t = new Tuple3(2,"wdl","el")
//    t.productIterator.foreach{
//      i => println("Value = " + i)
//    }
//    val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")
//    println("capitals.get( \"France\" ) : " +  show(capitals.get("France")))
//    println("capitals.get( \"India\" ) : " +  show(capitals.get("India")))
//    val a:Option[Int] = Some(3)
//    val b:Option[Int] = None
//    println("a.getOrElse(0):" + a.getOrElse(0))
//    println("a.getOrElse(10):" + b.getOrElse(10))
//    println(matchTest(3))
//    val pattern = "Scala".r
//    val str = "Scala is Scalable and cool"
//    val pattern = new Regex("(S|s)cala")
//    val pattern = new Regex("abl[ae]\\d+")
//    val str = "ablaw is able1 and cool"
//    println((pattern findAllIn  str).mkString(","))
//    println ("Apply method : " + apply("Maxsu", "gmail.com"));
//    println ("Unapply method : " + unapply("Maxsu@gmail.com"));
//    println ("Unapply method : " + unapply("Maxsu Ali"));
//    val x = Demo(5)
//    println(x)
//    x match {
//      case Demo(num) => println(x + " is bigger two times than " + num)
//      case _ => println("i cannot calculate")
//    }
  }
  def apply(x: Int) = x * 2

  def unapply(z: Int):Option[Int] = if (z % 2 == 0) Some(z / 2) else None

  def apply(user: String, domain: String) = {
    user + "@" + domain
  }

  def unapply(str: String):Option[(String, String)] = {
    val parts = str split "@"

    if (parts.length == 2){
      Some(parts(0),parts(1))
    } else {
      None
    }
  }

  def show(x: Option[String]) = x match {
    case Some(s) => s
    case None => "?"
  }
}

class ThisExample{
  var id:Int = 0
  var name:String = ""
 def this(id:Int, name:String){
    this()
    this.id = id
    this.name = name
  }
}
