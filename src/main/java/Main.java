import java.util.Scanner;
import java.util.Random;


public class Main {


    public static void main(String[] args) {


        int guess = 0;
        int count = 0;
        int lastguess = 0;
        Random rand = new Random();
        int number = rand.nextInt(50);
        Scanner scan = new Scanner(System.in);


        boolean correct = false;
        while (correct == false)
        {
            System.out.println("Take a guess at the number!");
            guess = scan.nextInt();
            if (guess > number)
            {
                System.out.println("That number was too large");
                if(guess!=lastguess)
                {


                    count++;
                    lastguess=guess;
                }
            }
            else if (guess < number)
            {
                System.out.println("That number was too small");
                if(guess!=lastguess)
                {
                    count++;
                    lastguess=guess;
                }
            }
            else
            {
                System.out.println("Congrats! You guessed the correct number");
                System.out.println("You took: " + count + " tries!");
                correct = true;
            }
        }
    }
}


