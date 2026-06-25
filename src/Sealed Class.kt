//sealed class
//Sealed class is a special class that has a fixed set of
// subclasses. Each subclass can have its own data.
//In simple words sealed class are those in which u must define or declare
//all subclass otherwise there will be error or u have to add else statement.

//first look at the code where we don't define all subclass.when u run it
//there will be error.

//fun main(){
//    val result: Result = Success("Data loaded")
//
//    when(result){
//        is Success -> println("Success!")
//        // forgot Error and Loading ❌ no warning from Kotlin!
//
//    }
//}
//
//sealed class Result
//class Success(val data: String) : Result()
//class Error(val message: String) : Result()
//class Loading : Result()


//now here in this part of code there will be no error cuz all the subclasses
//are declare.
fun main(){
    val result: Result = Success("Data loaded")

    when(result){
        is Success -> println("Success!")
        // forgot Error and Loading ❌ no warning from Kotlin!
        is Error -> println("Error")

        is Loading -> println("Loading")


    }
}

sealed class Result
class Success(val data: String) : Result()
class Error(val message: String) : Result()
class Loading : Result()