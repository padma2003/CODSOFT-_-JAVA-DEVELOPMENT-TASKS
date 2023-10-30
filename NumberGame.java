import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int player_guess,correct_answer,chances=8,tries=0; 
        int rem_tries;
        final int Max = 101;
        int i;
            
        System.out.println("WELCOME TO NUMBER GAME");
        System.out.println("APART FROM THE FIRST ATTEMPT, YOU HAVE 7 CHANCES TO GUESS THE CORRECT NUMBER");
        System.out.println();
        System.out.println("Guess any number between 1 to 100");
        correct_answer = r.nextInt(Max);

        for(i=0;i<chances;i++)
        {
            
            player_guess = sc.nextInt();
            if(player_guess >= 0 && player_guess <= 100)
            {
                if(player_guess == correct_answer)
                {
                    System.out.println("Congratulations!!! Your guess "+player_guess+" is a correct one.");
                    System.out.println("You have correctly guessed the number in "+tries+" number of tries.");
                    System.out.println();
                    break;
                }
                else if(player_guess > correct_answer)
                {
                    System.out.println("Your guess is higher than the correct number. Try again with a lower number.");
                    tries+=1;
                    rem_tries = chances - tries;
                    System.out.println("You have "+rem_tries+" remaining tries.");
                    System.out.println();
                }
                else if(player_guess < correct_answer)
                {
                    System.out.println("Your guess is lower than the correct number. Try again with a higher number.");
                    tries+=1;
                    rem_tries = chances - tries;
                    System.out.println("You have "+rem_tries+" remaining tries.");
                    System.out.println();
                }
            }
            else
            {
                System.out.println("The number you've guessed is invalid.\n Try again with a number between 1 to 100.");
            }
        }
        if(tries == chances)
        {
            System.out.println("Sorry!! You are out of chances.\nThe correct number is "+correct_answer);
        }
    }
    
}
