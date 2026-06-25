//Enum class
//Enum class is a special class that holds a fixed set of named constants.
// It is used when a variable can only have one value from a limited set of options.

//
//fun main(){
//    var day=days.thursday
//    println(day)
//
//    days.wednesday
//    println(day)
//}
//enum class days(){
//    sunday,
//    monday,
//    tuesday,
//    wednesday,
//    thursday,
//    friday,
//    saturday;
//}


//practice
//🚦 Traffic Light System
//Create an enum class called TrafficLight with:
//
//RED, YELLOW, GREEN
//
//In main:
//
//Create a variable with any light color
//Use when to print what to do:


fun main(){
  var LightColor=TrafficLight.RED
   when(LightColor){
       TrafficLight.RED -> println("Stop")
       TrafficLight.YELLOW-> println("Get Ready")
       TrafficLight.GREEN -> println("Go")
   }


}
enum class TrafficLight(){
    RED,
    YELLOW,
    GREEN;
}

