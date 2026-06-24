fun main(){
    var result=Person("Zaid",17)
    var result2=Person("Zaid",20)
   println( result.canVoteOrNot())
    println(result2.canVoteOrNot())
}
class Person(val name : String,
             val age : Int){
    fun canVoteOrNot() : Boolean {
     return   age>18
    }
}