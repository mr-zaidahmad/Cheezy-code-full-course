//null safety
//Null safety is a feature in Kotlin that prevents NullPointerException by forcing
// the developer to handle null values before using them. Variables cannot be null
// by default unless declared with ?.
//there are 4 ways to handle null but here we will look at three ways
//null safe and elvis operator

// lets look at elvis operator and null sate together.

fun main(){
   var gender: String="Male"
    var gender2:String?=null //here null works with ? after it's datatype

    var age : Int?=null   //here null works with ? after it's datatype

    println(gender2?:"Female")  //here's how u declare null with value
    println(age?: 20)           //here's how u declare null with value

//     println(gender2 !!)  //there will be bcz !! or not null asserted operator is used to check
//                 //and through error or not it says like if there object is assigned null
//               //it will through error if not then it will run this code.


}

//one more program
//fun main (){
//    var age :Int=21
//
//    var name : String?=null //safe call
//    println(name?.length)  //safe call to print null.so it will print null.
//
//    println(name ?: "Zaid") //through elvis operator ?: we can denote it with value.
//    println(age ?: 25) //here elvis opreator will not work bcz it's value is
//                  // already assigned to it which is 21 so it will print 21 instead
//                  //of 25
//}
