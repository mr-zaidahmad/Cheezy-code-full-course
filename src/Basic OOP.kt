//OOP
//    fun main(){
//          var mehran=car("Mehran",1300000,2013,"greenish")
//          println(mehran.name)
//          mehran.Driving()
//        println(mehran)
//
//    }
//  class car(val name:String,
//                 var price:Long,
//                 val type:Int,
//                 val color:String
//                 ){
//      fun Driving(){
//         println("Driving")
//      }
//  }

//  //OOP to print whole details in one line about mehran


//  fun main(){
//      var mehran=car("Mehran",1300000,2013,"greenish")
//      println(mehran)
//
//  }
//  data class car(val name:String,    //using the word data to print all the details
//            var price:Long,
//            val type:Int,
//            val color:String
//  ){
//      fun Driving(){
//          println("Driving")
//      }
//  }


//  fun main(){
//
//      val p1=person("ZAID",21)
//      val p2=person("abid",17)
//      println(p1.canvote())
//      println(p2.canvote())
//
//  }
//  class person(val name:String,
//               var age:Int
//                ){
//
//      fun canvote():Boolean{
//          return age>18
//      }
//
//  }


      //OOP  practice

//      🟢 Project 1: Student Management (Beginner)
//      🎯 Goal
//      Create a Student class.
//      Requirements:
//      name (String)
//      rollNumber (Int)
//      marks (Int)
//      Functions:
//      isPassed() → returns true if marks ≥ 50
//      grade() →
//      80+ → A
//       70–79 → B
//      60–69 → C
//      50–59 → D
//      Below 50 → F
//      Override toString() so when you print the student, it prints everything in one line.
//      In main():
//      Create 2–3 students
//      Print their details
//      Print whether they passed
//       Print their grade


//  fun main(){
//
//      var zaid=Student("Zaid",475,80)
//      var abbas=Student("Abbas",394,70)
//      var yasin=Student("Yasin",395,55)
//      var ibrar=Student("Ibrar",396,40)
//      println(zaid)
//      println(abbas)
//      println(yasin)
//      println(ibrar)
//      println("...........................................")
//      println(zaid.isPassed())
//      println(abbas.isPassed())
//      println(yasin.isPassed())
//      println(ibrar.isPassed())
//      println("...........................................")
//      println(zaid.grade())
//      println(abbas.grade())
//      println(yasin.grade())
//      println(ibrar.grade())
//      println("...........................................")
//
//  }
//   data class Student(var name:String,
//                var rollNumber:Int,
//                var marks:Int){
//       fun isPassed(): Boolean{
//           return marks>=50
//       }
//       fun grade():String{
//           return when{
//               marks>=80->"A"
//               marks>=70->"B"
//               marks>=60->"C"
//               marks>=50->"D"
//               else -> "F"
//           }
//       }
//      }


//  🟡 Project 2: Simple Bank Account
//  Now we add behavior.
//  🎯 Goal
//  Create a BankAccount class.
//  Properties:
//  accountHolder (String)
//  balance (Double)
//  Functions:
//  deposit(amount: Double)
//  withdraw(amount: Double)
//  Don’t allow to withdraw if balance is not enough
//  showBalance()
//  In main():
//  Create one account
//  Deposit money
//  Withdraw money
//  Try withdrawing more than balance
//  Print final balance

//  fun main(){
//      val acc1=BankAccount("Zaid",50000.0)
//      acc1.showbalance()
//      acc1.deposit(13000.0)
//      acc1.showbalance()
//      acc1.withdraw(15000.0)
//      acc1.showbalance()
//      acc1.withdraw(100000.0)
//  }
//  class BankAccount(val accountholder :String,
//                    var balance : Double){
//
//      fun deposit(Amount:Double){
//          balance += Amount
//          println("$Amount deposited")
//      }
//      fun withdraw(Amount: Double){
//          if (Amount>balance){
//              println("Amount exceded the deposit")
//          }
//          else{
//              balance -= Amount
//              println("$Amount withdrawn")
//
//          }
//      }
//      fun showbalance(){
//       println(balance)
//      }
//
//  }





























fun main(){
    //  🟡 Project 2: Simple Bank Account
//  Now we add behavior.
//  🎯 Goal
//  Create a BankAccount class.
//  Properties:
//  accountHolder (String)
//  balance (Double)
//  Functions:
//  deposit(amount: Double)
//  withdraw(amount: Double)
//  Don’t allow to withdraw if balance is not enough
//  showBalance()
//  In main():
//  Create one account
//  Deposit money
//  Withdraw money
//  Try withdrawing more than balance
//  Print final balance
    val account= BankAccount("Zaid",20000.0)
    println(account)
    account.Deposit(1000.0)
    account.withDraw(3000.0)
    account.showBalance()
}
data class BankAccount(var accountHolder : String,var  balance: Double){
    fun Deposit(amountdeposit : Double) {
         balance +=amountdeposit
        println(balance)
    }
    fun withDraw(amount : Double){
      balance -= amount
        println(balance)
    }
    fun showBalance(){
       println(balance)
    }
}