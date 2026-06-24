//getters
//getter changed what already there is it's not like setter to completly change it value.

  fun main(){
   var introduction=person("zaid ahmad",22)
      println(introduction.name)

  }

  class person(nameparam : String, ageparam : Int){
      var name= nameparam
          get(){   //for getter here I'm changing my name from small words to capitall words
              return field.uppercase()
          }
      var age: Int = ageparam
  }