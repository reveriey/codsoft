import java.util.Random;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        Random Random = new Random();
        int score = 0;
        int totalrounds = 3;
        System.out.println("number game starts");
        System.out.println("You have " + totalrounds + " rounds");

        for (int round = 1; round <= totalrounds; round++) {
            if (round > 1) {
                System.out.print("Do you want to play round " + round + "? yes or no: ");
                Scanner.nextLine();
                String answer = Scanner.nextLine();
                if (answer.equals("no")) {
                    System.out.println("Game over!");
                    break;
                }
            }
            int number = Random.nextInt(100) + 1;
            int attempts = 0;
            boolean correct;
            System.out.println("Round " + round);
            while (attempts < 3) {
                System.out.print("Enter your guess: ");
                int guess = Scanner.nextInt();
                attempts++;
                if (guess < number) {
                    System.out.println("Too low!");
                } 
                else if (guess > number) {
                    System.out.println("Too high!");
                } 
                else {
                    System.out.println("Correct!");
                    correct= true;
                    score= score+1;
                    break;
                }
            }

            if (correct= false) {
                System.out.println("Game over!, number is " + number);
            }
        }
        System.out.println("Game Over!");
        System.out.println("Score: " + score);
    }
}

