////Default constructor
//  fun main(){
//    val result=Calculator()   //when there is no constructor(properties) then u have to add () to call the class
//       println(result.add(2,3))
//       println(result.multiply(2,3))
// }
//    class Calculator{      //not using properties i.e () then it is known as default constructor
//      fun add(a:Int,b:Int):Int{
//          return a+b
//      }
//      fun multiply(a:Int,b:Int):Int{
//          return a*b
//      }
//  }
























//fun main(){
//    var result=constructor()
//   println( result.add(3,6))
//    println(result.multiply(7,2))
//}
//class constructor{
//    fun add(num1 : Int,num2 :Int):Int{
//        return num2+num1
//    }
//    fun multiply(num1 : Int,num2: Int):Int{
//        return num1*num2
//    }
//}

fun main(){
   val result=const()
    println(result.name)
    println(result.age)

}

class const(){
    val name="zaid"
    val age=18
}

