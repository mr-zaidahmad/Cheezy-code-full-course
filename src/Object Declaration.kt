
////object declaration
////Object is like a class but with only one copy in the whole program.
// We use it when we want to share the same data everywhere
// without creating multiple copies. We write object instead
// of class and use it directly without creating an instance.

//in simple words when there is repeation in one thing like giving likes,doing comments
// we use objects.but when there is different things like animal and animals have types
// we use class.

//fun main(){
//    println(A.num1)  //no need to make object cuz it's already  define
//    B.method()       // directly in the object declaration
//
//
//}
////object A(){  //Error cuz object can't have constructor.
////
////}
//
//object A{
//    val num1 :Int=7
//}
//object B{
//    fun method(){
//        println("object B")
//    }
//}



//Another Example

//fun main(){
//    FBlikes.FBlikess()
//    FBlikes.FBlikess()
//    FBlikes.FBlikess()
// println("-----------------------------")
//    InstaLikes.InstaLikess()
//    InstaLikes.InstaLikess()
//    InstaLikes.InstaLikess()
//    InstaLikes.InstaLikess()
//
//}
//object FBlikes{
//    private var FBlikescounter : Int=0      //we private it bcz anyone can change the
//                                            //likes if we didn't do that
//
//    fun FBlikess() : Int{
//        println("Facebook likes $FBlikescounter times")
//    return   FBlikescounter++
//
//    }
//
//}
//object InstaLikes{
//
//    private var Instacounter : Int=0      //we private it bcz anyone can change the
//                                        //likes if we didn't do that
//
//    fun InstaLikess() : Int{
//        println("Facebook likes $Instacounter times")
//         return Instacounter++
//
//    }
//
//}

//practice


//YouTube Video Stats
//Create an object called VideoStats that tracks:
//
//views (Int)
//likes (Int)
//comments (Int)
//
//Functions:
//
//addView() → increases views
//addLike() → increases likes
//addComment() → increases comments
//showStats() → prints all three stats together

//fun main(){
//    VIdeoStats.addView()
//    VIdeoStats.addView()
//    VIdeoStats.addView()
//    VIdeoStats.addView()
//    VIdeoStats.addView()
//    VIdeoStats.addView()
//
//
//    VIdeoStats.addLike()
//    VIdeoStats.addLike()
//    VIdeoStats.addLike()
//    VIdeoStats.addLike()
//    VIdeoStats.addLike()
//
//
//    VIdeoStats.addComments()
//    VIdeoStats.addComments()
//    VIdeoStats.addComments()
//
//    VIdeoStats.showstats()
//
//}
//object VIdeoStats{
//    private var views : Int=0
//    private var likes : Int=0
//    private var comments : Int=0
//
//    fun addView(){
//        views++
//    }
//    fun addLike(){
//        likes++
//    }
//    fun addComments(){
//        comments++
//    }
//    fun showstats(){
//        println("Views = $views ,Likes = $likes,Comments = $comments")
//    }
//}



//🏫 University Admission Counter
//Create an object called AdmissionOffice that tracks:
//
//totalStudents (Int)
//totalFees (Double)
//
//Functions:
//
//admitStudent(name: String, fees: Double) → increases student count, adds fees, prints "name has been admitted"
//showReport() → prints total students and total fees collected

//fun main(){
//   AdmissionOffice.admitStudent("zaid",20000.0)
//    AdmissionOffice.admitStudent("Ali",20000.0)
//    AdmissionOffice.admitStudent("Hamza",20000.0)
//    AdmissionOffice.admitStudent("Obaid",20000.0)
//    AdmissionOffice.admitStudent("Haris",20000.0)
//
//     AdmissionOffice.showReport()
//}
//object AdmissionOffice{
//   private var totalStudents : Int= 0
//    private var totalFees : Double=0.0
//
//    fun admitStudent(name: String, Fees: Double){
//       totalStudents++
//        totalFees+=Fees
//        println("$name has been added")
//    }
//    fun showReport(){
//            println("Fees per head PKR 20000.0")
//         println("total Student = $totalStudents")
//        println("total Fees = $totalFees")
//    }
//}


