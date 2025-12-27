import java.util.*;
public class NumberGuessingGame {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

         System.out.println("-----Number Guessing Game!------");
        System.out.println();
        System.out.println();
        System.out.println("Choose levels between");
        System.out.println("1. Low");
        System.out.println("2. Medium");
        System.out.println("3. High");
        System.out.println("Choose Level: ");
        int op = sc.nextInt();
        switch(op){

        case 1:
        int secret = rand.nextInt(50);
        int guess = 0;
        int attempts = 0;

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
        break;
        case 2:
        int sec = rand.nextInt(100);
        int gue = 0;
        int attem = 0;
        System.out.println("I am Guessing a number between 1 to 100");
        System.out.println("Try to Guess the number in 3 or less than 3 attempts");

        while(gue != sec){
            System.out.print("Enter your Guess: ");
            gue = sc.nextInt();
            attem++;
            
            if(gue < sec){
                System.out.println("Too Low bro!");
                System.out.println("Try again");
                System.out.println();
                
            }else if(gue > sec){
                System.out.println("Too High bro!");
                System.out.println("Try again");
                System.out.println();
            }else{
                if(attem == 1){
                System.out.println("Correct! you guessed in first attempt");
                }
                else if(attem == 2){
                    System.out.println("Correct! you guessed in second attempt");
                }else if(attem == 3){
                    System.out.println("Correct! you guessed in Third attempt");
                }else if(attem >3){
                    System.out.println("Correct!guessed in "+attem+" attempts, but Your attempts are too High");
                }
            }
        }
        break;
        case 3:
        int s = rand.nextInt(500);
        int gu = 0;
        int atte = 0;
        System.out.println("I am Guessing a number between 1 to 500");
        System.out.println("Try to Guess the number in 3 or less than 3 attempts");

        while(gu != s){
            System.out.print("Enter your Guess: ");
            gu = sc.nextInt();
            atte++;
            
            if(gu < s){
                System.out.println("Too Low bro!");
                System.out.println("Try again");
                System.out.println();
                
            }else if(gu > s){
                System.out.println("Too High bro!");
                System.out.println("Try again");
                System.out.println();
            }else{
                if(atte == 1){
                System.out.println("Correct! you guessed in first attempt");
                }
                else if(atte == 2){
                    System.out.println("Correct! you guessed in second attempt");
                }else if(atte == 3){
                    System.out.println("Correct! you guessed in Third attempt");
                }else if(atte >3){
                    System.out.println("Correct!guessed in "+atte+" attempts, but Your attempts are too High");
                }
            }
        }
        break;
        }
        sc.close();

    }
}

