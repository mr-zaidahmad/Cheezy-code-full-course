//while loops

//  fun main(){
//      var number=2
//      var digit=1
//      while (digit<=10){
//          println("2 x  $digit = ${number * digit}")
//          digit++
//      }
//
//  }



//while loops  practice


//  fun main() {
////            Write a Program in kotlin that takes Integer values from user,
//  //            and then find the largest number among all the Integers,
//  //            and display the largest number on the screen.
//  //            Use While loop to control the Input, Terminate the
//  //            Program on entering zero. Find the Largest Integer Using If Statement.
//    var largest = Int.MIN_VALUE
//    var num: Int
//
//    println("Enter numbers (enter 0 to stop):")
//
//    while (true) {
//        num = readln().toInt()
//        if (num == 0) {
//            break
//        }
//
//        if (num > largest) {
//            largest = num
//        }
//    }
//
//    println("The largest number is: $largest")
//}

fun main(){
    var sum = 0

    print("Enter your number: ")
    var num = readLine()!!.toInt()  // ask BEFORE loop

    while(num != 0){
        sum += num                   // add to sum
        print("Enter your number: ")
        num = readLine()!!.toInt()  // ask AGAIN inside loop
    }

    println("Total sum: $sum")
}


