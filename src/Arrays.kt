//  fun main() {
//      var arr=arrayOf("Zaid","Hamza","Haris")
//      for (i in arr){
//          println(i)  //using loop is necessary in arrays cuz loop let us go through elements one by one
//      }
//      println("------------------------------------")
//      println(arr[2]) // we can also put the index of the array, and it will only print that value
//      println("------------------------------------")
//      println(arr.size)  //this size function tell us the size of an array not index that's why it's output
//                         //will be 3 not 2
//  }

//  fun main() {
//      var arr= arrayOf(1,3,4)
//      println(arr.contentToString())  //if u don't want to use loop in array we can use this function too
//                                      //but I will prefer to use loop instead of this function
//  }

//fun main() {
//    var arr=arrayOf<Any>("Zaid",1,3.5f)  //if u want to use all types of datatypes in one array
//                                        //we use <Any> function it will allow us to use any kind of datatypes
//                                        //in one array
//    for (i in arr){
//        println(i)
//    }
//}












fun main(){
    var arr=arrayOf<Any>(1,4,7,"Zaid")
    for (i in arr){
        println(i)
    }
     arr.set(3,"hello")
    println(arr.get(3))

}