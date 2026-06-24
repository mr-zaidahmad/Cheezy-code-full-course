
//constructor with initializer
//initilizer are those that run automatically they don't need println.just declare it in the methods and it will run

  fun main(){
      var nm=Persn("Zaid",22)
  }
  class Persn(name:String,age:Int,){

      init {
          println("$name is printed")
      }
      init {
          println("$age age is printed")
      }
  }