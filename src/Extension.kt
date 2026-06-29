//Extension function allows you to add a new function
// to an existing class without modifying it.
fun main(){
    println("hello World".formattedString())

}
fun String.formattedString() : String{
   return "--------------\n$this\n--------------"
}

