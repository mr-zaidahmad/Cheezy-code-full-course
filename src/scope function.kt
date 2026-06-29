//there are four scope function.
//apply,let,with.

//Apply function.
//apply is a scope function that is used to set multiple properties of an object at once.
//It refers to the object as this and returns the object itself after the block executes.
fun main(){
  //when using simple
    var obj=Employees()

    obj.apply {
        name="Zaid"  //no need to write obj.name
        id=342      //no need to write obj.id
        duty="Intern"   //no need to write obj.duty
    }
    println(obj)
}
data class Employees(var name : String="",var id : Int=1 ,var duty : String="")

//let function
//let is a scope function that executes a block of code on a non-null object. It refers to the
// object as it and returns the last line of the block. It is mainly used for null safety checks.
//let function work best at nullable objects safely.
//in simple word let is the upgraded version of apply.in apply we needed to write
//obj.name,obj.id...... but here we use it instead of obj.
//but before that lets look at simple let function
//fun main(){
//    //when using simple
//    var obj=Employees()
//    obj.name="Zaid"
//    obj.duty="Intern"
//    obj.id=523
//
//    obj.let {
//       println(it.name)  //no need to write obj.name
//        println(it.duty)  //no need to write obj.duty
//        println(it.id)    //no need to write obj.id
//    }
//
//
//
//}
//data class Employees(var name : String="",var id : Int=1 ,var duty : String="")

//now lets look null with let function
//fun main(){
//    //when using simple
//    var obj: Employees?=Employees()  //when using null u have to define safe call for every object.
//    obj?.name="Zaid"     // like here ? or null safe is defined without it there will be error.
//    obj?.duty="Intern"   // like here ? or null safe is defined without it there will be error.
//    obj?.id=523        // like here ? or null safe is defined without it there will be error.
//    println(obj)
//    println("----------------------")
//    //to get rid of ? define for every obj we use let function
//    obj?.let {    //just define ? or null safe call here your whole function became null safe call.
//        it.name="Zaid"  //no need to define ? here
//        it.duty="Intern"  //no need to define ? here
//        it.id=234    //no need to define ? here
//
//    }
//    println(obj)
//}
//data class Employees(var name : String="",var id : Int=1 ,var duty : String="")



//With function
//it allows you to call multiple functions or access multiple properties of an object
// without repeating its name. It refers to the object as this and returns the
// last line of the block.
//in simple word with is the upgraded version of let. it let we have to define
//it with every obj but here there is no need for that.

//fun main(){
//    //when using simple
//    var obj: Employees=Employees()
//    obj?.name="Zaid"
//    obj?.duty="Intern"
//    obj?.id=523
//    println(obj)
//    println("----------------------")
//
//    with(obj){ //with is used here
//        name="Zaid"   //with the help of with fun we only write the name.no obj,no it just name.
//        duty="Intern" //with the help of with fun we only write the duty.no obj,no it just duty.
//        id=523       //with the help of with fun we only write the id.no obj,no it just id.
//    }
//    println(obj)
//}
//data class Employees(var name : String="",var id : Int=1 ,var duty : String="")