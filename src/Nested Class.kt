//nested class
//it is a class defined inside another class.
//there are two types of nested class
//1:regular or normal nested class
//2:inner nested class

//first lets look at the normal or regular nested class.
//fun main(){
//    //for normal class we acces them like this
//    val obj=outer()
//    println(obj.num)  //normal class can be call like this.
//
//    val obj2= outer.nestedclass()   //nested class is called like this
//    obj2.testing()
//
//
//}
//class outer(){
//    var num=21
//    class nestedclass(){
//        fun testing(){
//            println("I'm nested class")
//        }
//    }
//
//}


//now lets look at the inner nested class.
//Inner class.
//it can access outer class properties.
fun main(){
   val obj=outer().nestedclass() //we call inner class like this.
    obj.testing()


}
class outer(){
    var num=21
    inner class nestedclass(){
        fun testing(){
            println("I'm nested class $num")  //with the help of inner we can now access content
                               //outside the nested class. like here we used num.
        }
    }

}