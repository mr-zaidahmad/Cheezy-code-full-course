//   //there are total of 4 modifiers in kotlin public,private,internal,protected
//   //All classes by default are public.
//   //one more point to remember modifiers are not only for classes. u can use
//   //it in variable,functions,constructors and properties of constructors too.
//
//fun main(){
//
//    val d :prt = prt()
//
//
//}
//public class A    //as we said that all function by default are public so writing
//                   //so writing public here isn't necessary.
//
//
//   internal class gn()   //internal are like public but here u can access internal class
//                   //only in this module/project.it can't be use in others module/project.our module/project here
//                   //are Arrays,functions,loops etc... all these are here in one file so we can access these only in this
//                   // file.
//
//
//   private class prt()  //private function can only be access in this class.there will be error if u try
//                       // accesing it outside this class.
//
//
//   // protected works inside a class and its subclasses (child classes)
//   open class Animal {
//       protected val sound: String = "Some sound"   // protected variable
//       // only Animal and its child classes can access this. also u can access it in any file.
//   }
//
//   class Dog : Animal() {           // Dog is a child/subclass of Animal
//       fun showSound() {
//           println(sound)           // this works because Dog is a subclass of Animal
//       }
//   }








//fun main(){
//    val objA=A()
//    objA.method()
//  println("----------------------------------")
//    val objB=B()
//    objB.method2()
//    println("----------------------------------")
//    val objC=C()
//    objC.method3()
//    println("----------------------------------")
//    val objE=E()
//    objE.method4()
//    println("----------------------------------")
//
//}
//public   class A(){  //it public by default so no need to declare it public
//    fun method(){
//        println("Public modifier")
//    }
//}
//internal class B(){    //just like public but accessable only in this project/module.
//    fun method2(){
//        println("Internal Modifier")
//    }
//}
//
// class C (){       //only accessable inside the same class where u denote private.
//     private fun privatemethod(){
//         println("private modefiers")
//     }
//
//     fun method3(){   //here we access it.now to call it just call method3 fun in main body and it will
//                    //be called
//         privatemethod()
//     }
//}
//
//open class D() {   //only worked in class or subclass for class it is the same as private
//    //but for subclass u have to make another class and inherit it from that
//    protected fun protectedmethod(){
//        println("protected modifier")
//    }
//
//}
//
//class E() :D(){
//    fun method4(){  //here child class is inherit from parent class and so we call the protected
//          //modifier from here. just use the method4 in main body and it will be called.
//        protectedmethod()
//    }
//}