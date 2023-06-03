import java.util.Scanner;
import java.lang.Math;

public class GuessingGame 
{
  public static void main(String[] args) 
  {
    // generate a random number between 1 and 100
    int ans = (int)(Math.random() * 100) + 1;
    // number of trials that the user has to guess the number
    int k = 10;
    Scanner sc= new Scanner(System.in);
    // TO check if the user has guessed the number
    boolean flag = false;
    System.out.println("A number between 1 and 100 is chosen.\nYou have "+ k+" tries to guess the number.");
    for(int i=1;i<=k;i++) 
    {
        System.out.println("Enter your guess: ");
        int g = sc.nextInt();
        // if the user guesses correctly, print the congratulation message and exit the program
        if (g == ans) 
        {
        System.out.println("You guessed the number correctly!");
        int score= 1000-(i*100);// A score system is implemented
        System.out.println("Your score is " + score);
        break;
        }
        // if the user guesses greater than the number, print the message and reduce the number of trials
        else if (g > ans) 
        {
        System.out.println("Your guess is too high.\nYou have " + (k - i) + " tries left.");
        }
        // if the user guesses less than the number, print the message and reduce the number of trials
        else 
        {
        System.out.println("Your guess is too low.\nYou have " + (k - i) + " tries left.");
        }
    }
    // if the user has run out of trials, print the message and exit the program
    if (flag == false) 
    {
      System.out.println("Thanks for playing!!");
    }
  }
}
