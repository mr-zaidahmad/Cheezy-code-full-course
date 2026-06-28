//Exception Handling
//it is a way to handle runtime errors gracefully without crashing the program.
// We use try, catch, and finally blocks to catch and handle errors.
//1:we use try to check the error. and help to run it.

//2:catch is to catch the error and print statement telling the user that u enter
//something wrong like age.Age can't be negative and user put his age -23

//3:Finally is the keyword that will run statement no matter what it like init
//it will always run.

fun main(){
      var arr =arrayOf<Any>("Zaid",2,4.5,8)  //here we have only 4 elements which index =3

    try {
        println(arr[6])    //here let suppose user put 6 index where there is no 6 index in
             //our program. it is error but it will execute no matter what.
    }
    catch (hello : Exception) {
        println("u have enter wrong index")  //when user put wrong index this statement will
        //catch that error and it will run.otherwise it won't run.
       //one more point to catch is that u can define multiple catch function.
       // one more thing is if u define multiple catch the exception one should be the last
        // last one cuz it's the parent/base class of catch function.
    }
    finally {
        println("this statement will run no matter what.")
    }

    //last thing to note that u can never use try only u must have to use either catch or
    //finally with it.
    //e.g
//    try {} catch (e : Exception){}
    //0r
//    try { } finally {}

}