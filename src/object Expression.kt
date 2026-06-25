//object expression.
// Object Expression is used when you  need a one time use
// object without creating a full class.

fun main(){
  var objExpression= object {  //declare inside the main body
      fun Method(){
          println("object Expression is used here")
      }
  }
    objExpression.Method()   //also called inside the main body
}
