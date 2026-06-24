
fun main() {
    val circle = Circle2(4.2)
    val player=Player("Zaid")
    if (circle is Circle2){   //here we are checking whether circle is the object of circle2
                            //if we give circle is Player then it will give error cuz
            //circle is the obj of Circle2 not Player that's how we check the type checking

        println("This is a Circle")
    }
}
interface Draggable{
    fun drag()
}
abstract class Shape2 {
    abstract fun area2(): Double
}
class Circle2(val Radius : Double) : Shape2(), Draggable {
    override fun area2(): Double = Math.PI * Radius * Radius
    override fun drag()=println("circle is Draggable")
}
class Player(val name : String) : Draggable {
    override fun drag()=println("$name is dragging")
    fun saymyname(){
      println(" my name is $name ")
    }
}


