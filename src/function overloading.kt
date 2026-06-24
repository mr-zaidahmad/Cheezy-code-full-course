//function overloading
//fun main() {
//   addition(1,5)
//   addition(3,6,8)
//}
//  fun addition(a: Int,b: Int){
//   println(a+b)
//  }
//  fun addition(a: Int,b: Int,c: Int){
//    println(a+b+c)
//  }




fun main(){
    val fn =::add
    println(fn(2.3,4.6,8.9))
}
fun add(num1 : Double,num2: Double,num3: Double): Double{
    return num1+num2+num3.toDouble()
}
//fun add(num1: Int,num2: Int): Double{
//    return num1+num2.toDouble()
//}
