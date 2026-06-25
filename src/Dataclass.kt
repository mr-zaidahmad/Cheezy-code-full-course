//Data class
//Data class is a special class in Kotlin that is used to store data.
// It automatically provides useful functions like toString(), copy(), and
// equals() without writing them manually.

//before Data class lets look at the  normal class.
//fun main(){
//    var p1=prsn("Zaid",23)
//    var p2=prsn("Zaid",23 )
//    println(p1)  //tostring() not add so the output will be something else.
//    println(p2)  //tostring() not add so the output will be something else.
//
//    println(p2 == p1) //false bcz normal class check address of data not actual data
//
//    println(p1.hashCode())   //these are the address you can see that are different
//    println(p2.hashCode())
//}
//class prsn(name : String, age: Int){
//
//}

// just adding the Data keyword and se the changes in ouput
fun main(){
    var p1=prsn("Zaid",23)  //the same output as the data here
    var p2=prsn("Zaid",23 )  //the same output as the data here
    println(p1)
    println(p2)

    println(p2 == p1)  //Now it will be true cuz it now checking the data not the address.

    println(p1.hashCode())   //the
    println(p2.hashCode())
}
data class prsn(var name : String,var age: Int){ //data class must have alteast one constructor
                  //now just by adding Data keyword look
                  // at the output of the code.it now actual data.
}
