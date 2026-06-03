import java.util.*;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;
        int guess;

        do {
            System.out.print("Guess number: ");
            guess = sc.nextInt();

            if(guess > number)
                System.out.println("Too High");
            else if(guess < number)
                System.out.println("Too Low");

        } while(guess != number);

        System.out.println("Correct!");
    }
}