//interface in like when there is something else that have same type like circle IS A shape,rectangle IS A shape
//if shape exist then we can have circle,rectangle etc... but what if we want to use another type of thing like
//player u can see that player and shape are totally different but the behaviour are the same
// as here the darg function is used in both player and shape to solve this kinda problem we use interface.

fun main(){
   dragobject(arrayOf(rectangle1(2.0,3.1),circle1(3.0),square1(2.1),
       player("hamza"))) //here for our code to be smaller we use all the class in array, and
        // it can now attomatically call it. this is very
    //imp bcz in future we will be using all the time array to call the obj so learn it.
}
//fun dragobject(obje : Array<Shape1>){ //here we make an array in which we store Shape1
//    //the shape1 is already having the rectangle1,square1,circle1 properties that's why we use
//    // array if we don't then u have to create object for every class.
//
//    for (obj in obje){
//        obj.drag()   //here we made an array trough loop which have drag fun in it.
//    }
//}

      //we can use both function shape1 and draggable but in interface we prefer the draggable


fun dragobject(obje : Array<draggable>){  //here just by usine the draggable interface we can acces the
     //drag fun without shape1.
    for (obj in obje){
        obj.drag()
    }
}


interface draggable{  //interface use here. it behaves like abstract class

    fun drag()   //if u don't define function in interface it became abstract fun by default
}
interface clonable{  //interface use here  it behaves like abstract class

    fun clone()   //if u don't define function in interface it became abstract fun by default
}
abstract class Shape1 :draggable, clonable{  //by using interface we can implement multiplte interfaces.
    abstract fun area1(): Double

}
class rectangle1(val base : Double,val height: Double) : Shape1() {
    override fun clone() {
        println("clone")
    }
    override fun drag(){
        println("rectangle is dragging")
    }
    override fun area1(): Double {
        val rectangle1result=0.5*base*height
        return rectangle1result
    }
}
class circle1(val radius1: Double) : Shape1() {
    override fun clone() {
        println("clone")
    }

    override fun drag(){
        println("circle is dragging")
    }
    override fun area1(): Double {
       val circle1result=Math.PI*radius1*radius1
        return circle1result
    }
}
class square1(val side: Double) : Shape1() {
    override fun clone() {
        println("clone")
    }
    override fun drag(){
        println("square is dragging")
    }
       override fun area1(): Double {
          val square1result : Double=side*side
           return square1result
       }
}
class player(val name : String) :draggable  {  //here with the help of interface we can now use the drag fun in
     // the player section without using the shape1 inheritance
    override fun drag(){
        println("$name is dragging")
    }
}



//lets look at one more small example
//fun main(){
//      val objduck=duck()
//    objduck.fly()
//    objduck.walk()
//    objduck.swim()
//
//    val objeagle=eagle()
//    objeagle.walk()
//    objeagle.fly()
//}
//interface swimable {
//    fun swim()
//}
//
//interface flyable{
//    fun fly()
//}
//interface walkable{
//    fun walk()
//}
//
//
//class duck() :swimable,flyable,walkable{
//    override fun walk() {
//       println("can walk")
//    }
//    override fun fly() {
//        println("can fly")
//    }
//
//    override fun swim() {
//        println("can swim")
//    }
//}
//
//class eagle() :flyable,walkable{
//    override fun walk() {
//        println("can walk")
//    }
//    override fun fly() {
//        println("can fly")
//    }
//
//}
