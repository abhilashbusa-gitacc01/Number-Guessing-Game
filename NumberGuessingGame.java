import java.util.*;
public class NumberGuessingGame {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int secret = rand.nextInt(50);
        int guess = 0;
        int attempts = 0;

        System.out.println("-----Number Guessing Game!------");
        System.out.println();
        System.out.println();
        System.out.println("I am Guessing a number between 1 to 50");
        System.out.println("Try to Guess the number in 3 or less than 3 attempts");

        while(guess != secret){
            System.out.print("Enter your Guess: ");
            guess = sc.nextInt();
            attempts++;
            
            if(guess < secret){
                System.out.println("Too Low bro!");
                System.out.println("Try again");
                System.out.println();
                
            }else if(guess > secret){
                System.out.println("Too High bro!");
                System.out.println("Try again");
                System.out.println();
            }else{
                if(attempts == 1){
                System.out.println("Correct! you guessed in first attempt");
                }
                else if(attempts == 2){
                    System.out.println("Correct! you guessed in second attempt");
                }else if(attempts == 3){
                    System.out.println("Correct! you guessed in Third attempt");
                }else if(attempts >3){
                    System.out.println("Correct!guessed in "+attempts+" attempts, but Your attempts are too High");
                }
            }
        }
        sc.close();

    }
}