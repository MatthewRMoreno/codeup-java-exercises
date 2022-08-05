import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        //ask user to guess a number between 1 and 100
//        System.out.println("Guess a number between 1 and 100:");
//        System.out.println("number: ");
//        int numGuess = scanner.nextInt();
//        //guessing game goes here
//        System.out.println(guessGame(numGuess));
        //generate a random number from 1-100
        int randomNum = (int)(1 + Math.random() * 100);
        //ask for number from user
        System.out.println("Guess a number between 1 and 100");
        System.out.println("Number: ");
        //create scanner
        Scanner scanner = new Scanner(System.in);
        //initiate the number of guesses used
        int guesses = 0;
        //set done to false in order to  give the function something to run for
        boolean endGame = false;
        while(!endGame){
            //scan for the users response
            int guess = scanner.nextInt();
            //each time guess is wrong it adds 1 to guesses
            guesses++;
            //if number the user guess is less than the random number "lower"
            if(randomNum < guess){
                System.out.println("LOWER!");
                System.out.println("Guess again!");
            }
            //if number the user guess is over the random number "higher"
            else if(randomNum > guess){
                System.out.println("HIGHER");
                System.out.println("Guess again!");
            }
            //number is guessed correctly "good guess" and end the game
            else{
                System.out.println("GOOD GUESS!");
                System.out.println("You guessed a total of " + guesses + " times until you got it right. Thanks for playing!");
                endGame = true;
            }
        }
        scanner.close();
    }
        //Guessing game
//        public static String guessGame ( int guess){
//            //input a scanner
//            Scanner scanner = new Scanner(System.in);
//            //create random number between 1-100
//            int randNum = (int) (1 + Math.random() * 100);
//            //while the guess is not equal to the random number
//            do {
//                if (guess < randNum) {
//                    System.out.println("HIGHER!");
//                    System.out.println("Guess again:");
//                    int newGuess = scanner.nextInt();
//                    return guessGame(newGuess);
//                } else if (guess > randNum) {
//                    System.out.println("LOWER!");
//                    System.out.println("Guess again:");
//                    int newGuess = scanner.nextInt();
//                    return guessGame(newGuess);
//                } else {
//                    return ("GOOD GUESS!");
//                }
//            } while (guess != randNum);

//            guesses++;
//
//            if(guess < randNum){
//                System.out.println("The number I'm thinking of is lower than " + guess + ".");
//                return("Guess again! (Please type a whole number and press enter.)");
//            }
//            else if(guess > randNum){
//                System.out.println("The number I'm thinking of is greater than " + guess + ".");
//                return("Guess again! (Please type a whole number and press enter.)");
//            }
//            else{
//                System.out.println("That's correct! I was thinking of a " + guess + ".");
//                System.out.println("It took you " + guesses + " guesses to get it right. Thanks for playing!");
//            }
//    }
//        return done;
//        }
}
