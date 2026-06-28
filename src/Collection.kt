//Collection
//Collection is a group of related values stored together. Kotlin has three main
// collections — List, Set, and Map. Each can be mutable (changeable) or immutable (fixed).

//first lets look at the immutableListof which is denota as Listof()
fun main(){
//    var num1 =listOf<Any>(1,3,7)
//
//    println(num1.indexOf(1))  //check element index here for 1 is 0 so output=0
//    println(num1.contains(5))  //check whether it contain element names here it is 5
//                              //and return ans as boolean here in this elements there
//        //is no element name 5 so it will return false.
//
//    //there are more methods in immutable. but here we saw only two.the point is that
//    //u can see these just tell this is happening. it can't add,remove or replaced
//    // to do those we use mutable function.
//
//    //now lets look at the mutableListOf
//    println("--------------------------")
//    var num2=mutableListOf<Any>(2,5,8,6)
//    println(num2)
////    num2.add(9)  //adding 9 to the num2 elements
////    println(num2)
//
////    num2.remove(2)  //removing element 2 from num2 elements
////    println(num2)
////       //and so on
//
//
//    //here now lets look at the imp thing we do in collevtion which is merging two
//    // lists together
//
//    var num3 = listOf(11,30)
//    num2.addAll(num3) //this will merge two lists together but remember this point
//    //that mutablelistof can merge two list not immutable that's why first we tool
//    //num2 which is mutablelistof object.
//     println(num2)  // to print we also took the mutabalelistof object.


    //now let look at map. it also have two types mutable and immutable.
    //for now lets look at the mutablemapof
    //In Map,Map stores data in key-value pairs —
    // like a dictionary where every word has a meaning.

    var a=mutableMapOf<Int, String>()   //here Int represent key and  String represent word.
    a[0]="Zaid"
    a[1]="Hamza"
    a[2]="Abbas"
    a[3]="Ibrar"
    a[7]="Yasin"

   //these key that we use i.e 0,1,2,3...... are not index it's just key that we give to them.
    //that' why i give yasin 7 so that i can't get confuse.the keys can bs string,boolean etc....
    //to print all the names with key we use for loop
    for ((k,v)in a){
    println("$k = $v")
    }

}