//do-while loops
//
//  fun main(){
//      var num=1
//
//      do {
//          println("hello")
//          num++
//      }while (num>5)
//
//
//  }

 //  do while loops  practice

  fun main(){
//   🧮 Project: Number Guessing Game
//
//Goal:
//Make a simple game where the program keeps asking the user to guess a secret number until they get it right.
//
//Description:
//
//Set a secret number in your code (like 7).
//
//Use a do...while loop so the program always asks the user to guess at least once.
//
//Keep looping until the user guesses the correct number.
//
//When they guess right, print a success message.


          val secretNumber = 7
          var guess: Int

          do {
              print("Guess the number: ")
              guess = readln().toInt()

              if (guess != secretNumber) {
                  println("Wrong guess, try again!")
              }

          } while (guess != secretNumber)

          println("Congratulations! You guessed the right number.")
      }
