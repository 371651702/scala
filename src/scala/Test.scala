package scala

//没有参数的case类将被声明为case对象而不是case类。 默认情况下，case对象是可序列化的。
////case只是常规类，默认情况下是不可变的,  类中列出的所有参数默认使用public和immutable修辞符
trait SuperTrait
case class CaseClass1(a:Int, b:Int) extends SuperTrait  //case类
case class CaseClass2(a:Int) extends SuperTrait   //case类
case object CaseObject extends SuperTrait   //case对象

object Test {

  def callCase(f: SuperTrait) = f match {
    case CaseClass1(f,g) => println("a = " + f + " b = " + g)
    case CaseClass2(f) => println("a = " + f)
    case CaseObject => println("NoArgument")
  }

  def main(args: Array[String]): Unit = {
//    callCase(CaseClass1(10,10))
//    callCase(CaseClass2(10))
//    callCase(CaseObject)
    var s = new Student(1010,"wdl",26)
    s.showDetails()
  }
}

class Student(id:Int, name:String){
  var age:Int = 0
  def showDetails(): String ={
    println(id + " " + name + " " + age)
    var s = "hello"
    s
  }
  def this(id:Int, name:String, age:Int) = {
    this(id,name)
    this.age = age
  }
}

