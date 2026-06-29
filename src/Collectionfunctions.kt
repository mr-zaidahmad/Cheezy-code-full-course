//Collection functions are built-in higher order functions in Kotlin that help perform
// operations on collections like filtering, transforming, searching and sorting without
// writing manual loops.

//most used ones are
//Map,filter,for each

// let's see the use of filter function.
//fun main(){
//
//    val lst=listOf(1,2,3,4,5,6,7,8,9)
//    val fltr=lst.filter (::isodd)  //filterGoes through list and removes items
//        // that don't match your condition. here we pass isodd fun in here and
//      // which return only those value which are odd.
//    println(fltr)
//
//    //now lets use lamdas in filter which will make it much more smaller
//    val lamdas=lst.filter {it %2==1}
//    println(lamdas)   //through lamda we can make it this smaller.
//}
//fun isodd(check : Int): Boolean{
//    return check %2==1
//}


//now map function
//map transform every item.
//it Goes through list and changes each item into something else.
//like u have list of names in lowercase e.g zaid,shahid..... and u want it to convert
//it to uppercase i.e ZAID,SHAHID..... for that we use map function.
//fun main(){
//    val lstof=listOf<String>("zaid","obaid","shahid")
//
//    val touppercase=lstof.map { it.uppercase() }
//    println(touppercase)
//}


//foreach function
// just loop through everything
//Like a normal for loop but cleaner.
fun main(){
    val num1=listOf(1,2,3,4,5,6,7,8)
     num1.forEach { println(it) }  //instead of using for loop
    //we can simply use for each which is smaller and cleaner
    //than for loop.

}