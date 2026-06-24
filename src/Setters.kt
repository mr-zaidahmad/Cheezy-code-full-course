

////setters
////we use setters to set something for us if we accidentally put wrong value like age.age
////can't be in negative that's not possible so we use setters to tell it that age can't be in negative.
//  fun main(){
//     var introduction=persoon("Zaid",21)
//      println(introduction.age)  //here the setters won't work because the default value we have set 21
//                                 //so if u need to see it. use changing property
//
//        introduction.age=-12  //this is changing property so here the setters will work.
//  }
//  class persoon(nameparam:String,ageparam:Int){
//      var name :String = nameparam
////          set(value) {   //this part of code won't work because we are using it above the age variable
//                           //it is now accesing the name variable so there will be error in it.
////              if (value > 0){
////                  field = value
////              }
////              else{
////                  println("Age can't be negative")
////              }
////          }
//      var age :Int = ageparam
//          set(value) {  //u have to use this set for setter but remember one thing u have to use it right beneath
//              //age variable that's how it will access it.if u right it somewhere else there will be error
//              if (value > 0){
//                  field = value  //field is a special keyword in Kotlin.
//                                 //Set the real value directly without calling setter again.(gpt)
//              }
//          else{
//              println("Age can't be negative")
//              }
//          }
//  }


fun main(){
    val result=human("Zaid",23)
   result.age=-12


}
class human(name : String, ageparam: Int){
    var age=ageparam
        set(value) {
            if (value>0){
                field=value
            }
            else{
                println("age can't be negative")
            }
        }
}

