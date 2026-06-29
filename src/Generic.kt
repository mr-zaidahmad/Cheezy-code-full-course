//Generics
//it allow us to create classes and functions that work with any data type without
// rewriting code for each type. We use <T> as a placeholder for the type which gets
// replaced with the actual type when the class or function is used.

//In simple words Think of a bag.You don't need a separate bag for books, clothes, and food.
//One bag holds anything → that's generics!
//fun main(){
//    val intBox = Box(123)
//    val stringBox = Box("Zaid")
//    val doubleBox = Box(3.14)
//
//    println(intBox.value)     // 123
//    println(stringBox.value)  // Zaid
//    println(doubleBox.value)  // 3.14
//}
//
//class Box<T>(val value: T)  // T means any type.


//one more thing we use in generics are vararg
//vararg is a keyword that allows a function to accept a variable number of arguments
// of the same type. Instead of passing a fixed number of values, you can pass as many
// as you want.
//fist lets look at fun without vararg.which will not run cuz there will be error.
//fun main(){
//    printNames("Zaid", "Ali", "Hamza")  // ❌ can't pass multiple values
//}
//
//fun printNames(name: String){  // only accepts ONE name
//    println(name)
//}

//now lets look at the use of vararg
//fun main(){
//    printNames("Zaid", "Ali", "Hamza", "Abdullah")  // ✅ pass as many as you want
//}
//
//fun printNames(vararg names: String){  // accepts ANY number of values
//    names.forEach { println(it) }
//}


//let look at one more example.
fun main(){
    add(1,3,5,67,5,5)
    add(5,5,5,5)
}
fun add(vararg values : Int){
   var sum=0
    for (i in values){
        sum+=i
    }
    println(sum)
}
