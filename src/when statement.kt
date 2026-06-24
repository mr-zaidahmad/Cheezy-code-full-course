//When statement

//fun main() {
//    val animal = "dog"
//    when (animal) {
//        "cat" -> println("animal is cat")
//        "horse" -> println("animal is horse")
//        "dog" -> println("animal is dog")
//        else -> println("animal is mouse")
//    }
//}


//using when statement in range


//fun main(){
//    val num=4
//    when(num){
//        1 -> println("one")
//        in 2..5 -> println("2..5 (range mode)")
//        6 -> println("six")
//        else -> println("Not in range")
//    }
//
//}




   //When statement  Practice

//    fun main(){
//
////     1. Day Finder
////     Hardcode a number from 1–7 and use when to print the day of the week.
////     Example: 1 → “Monday”, 2 → “Tuesday”, etc.
//    val day= 4
//    when(day){
//        1 -> println("Monday")
//        2 -> println("Tuesday")
//        3 -> println("Wednesday")
//        4 -> println("Thursday")
//        5 -> println("Friday")
//        6 -> println("Saturday")
//        7 -> println("Sunday")
//    }
//    }
//
//   fun main() {
////       2. Traffic Light
////
////        Hardcode a color name ("red", "yellow", "green") and use when to print what a driver should do.
////       Example: “red” → “Stop”, “green” → “Go”, “yellow” → “Wait”.
//
//     val colorname= "Red"
//       when(colorname){
//            "Red" ->println("Stop")
//           "Green" ->println("Go")
//           "Yellow" ->println("Wait")
//    }
//}

//  fun main() {
////      4. Calculator
////
////Hardcode two numbers and an operator (+, -, *, /) and use when to perform the correct operation
//      val num1= 4
//      val num2=7
//      val operator='*'
//
//
//    when(operator){
//        '+' -> println("Addition = ${num1 + num2}")
//        '-' -> println("Addition = ${num1 - num2}")
//        '*' -> println("Addition = ${num1 * num2}")
//        '/' -> println("Addition = ${num1 / num2}")
//          else -> println("Invalid input")
//    }
//      }


//fun main(){
//       //Project: Marks to Grade Converter using range in when statement
//    //
//    //You’ll hardcode a marks value and use ranges in when to decide the grade.
//    val gradeA ='A'
//    val gradeB ='B'
//    val gradeC ='C'
//    val fail="Fail"
//    val marks=87
//    when(marks){
//        in 0..45 -> println("$fail")
//        in 46..60 -> println("Your grade = $gradeC")
//        in 61..75 -> println("Your Grade = $gradeB")
//        in 76..100 ->println("Your Grade = $gradeA")
//
//    }
//
//}


//  fun main(){
//  //1. Countdown Timer
//  //Ask the user for a number and count down to 1 using a while loop.
//      println("what's your number: ")
//      var num=readLine()!!.toInt()
//      var count=num
//      while (count >=1){
//          println(count)
//          count--
//      }
//
//
//
//  }



