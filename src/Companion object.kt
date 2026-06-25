////Companion Object

//before Companion Object we will se how to use multiple objects insde the class.

//fun main(){
//       myclass.A.methodA()
//       myclass.B.methodB()
//      myclass.C.methodC()
//}
//class myclass(){
//    object A{
//        fun methodA(){
//            println("I'm A from object A")
//        }
//    }
//    object B{
//        fun methodB(){
//            println("I'm B from object B")
//        }
//    }
//    object C{
//        fun methodC(){
//            println("I'm C from object C")
//        }
//    }
//}



////companion object Definition.
////Companion Object is an object declared inside a class that can be accessed without
//// creating an instance of the class.

//by using the same example we can easily understand Companion object.

//we use companion for only that objecct where we don't want to decalare object name just
// classname then direct function. like here we will use myclass.methodA()
//one more point to remember there is only one companion of the class.

fun main(){
       myclass.A.methodA()  //here u can see that the object name A is blur bcz we made
                            // it as companion.this part of code will work too.
     myclass.methodA()     //here we directly access the methodA fun without usind object.

       myclass.B.methodB()
      myclass.C.methodC()
}
class myclass(){
    companion object A{    //we use companion keyword to activate companion
        fun methodA(){
            println("I'm A from object A")
        }
    }
    object B{
        fun methodB(){
            println("I'm B from object B")
        }
    }
    object C{
        fun methodC(){
            println("I'm C from object C")
        }
    }
}
