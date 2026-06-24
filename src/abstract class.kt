//  //we use abstract class only in parent class and we use it only that time when we don't know or don't want to
//  //pass any value in parent class
//
//fun main(){
//   val result=circle()
//    println(result.area())
//   result.display()
//    println(result.name)
//
//
//}
//abstract class Shape{  //
//    abstract val name: String  //abstract done here cuz we haven't defined it yet
//    abstract fun area(): Double   //abstract done here cuz we haven't defined it yet
//    abstract fun display()     //abstract done here cuz we haven't defined it yet
//
//                      //one more thing to notice is that when u declare abstract class u definitely need to
//    //define it in the child class otherwise there will de error
//}
//class circle() : Shape(){
//      override val name: String="Circle"
//    override fun area() : Double=Math.PI *5
//    override fun display() {
//       println("Circle display")
//    }
//}
//

























fun main(){
      var objCI = Zaid()
    println(objCI)
       objCI.dutyy()


    var objCI2=abdullah()
    println(objCI2)
    objCI2.dutyy()


    var objCI3=shahid()
    println(objCI3)
       objCI3.dutyy()

}
abstract class codersInsight() {
    abstract var name: String
    abstract var benchnum: Int
    abstract var duty: String

    override fun toString(): String {   //here we overide oue details
        // to one fun bcz we want all our details to be print in one time
        // we don't need to define obj.name,obj.duty etc....
        //now all our details will be print just by calling
        return "name: $name, bench num:$benchnum, duty: $duty"
    }
    abstract fun dutyy()
}
  class Zaid() :codersInsight(){
     override var name : String="Zaid"
      override var benchnum: Int =5
      override var duty: String="basic coder"
      override fun dutyy() {
          println("he is doing an intership")
      }
  }
class abdullah() :codersInsight(){
    override var name : String="Abdullah"
    override var benchnum: Int =2
    override var duty: String="graphic designer"
    override fun dutyy() {
        println("he do graphic designning for our team")
    }
}

class shahid():codersInsight(){
    override var name : String="Shahid"
    override var benchnum: Int =6
    override var duty: String="Developer"
    override fun dutyy() {
        println("he is our developer for our team")
    }
}

//dev