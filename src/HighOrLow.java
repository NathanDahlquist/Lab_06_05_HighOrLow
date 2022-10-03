import java.util.Scanner;

public class HighOrLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int random = (int)(Math.random() * 10 + 1);
        int guess;
        int guessAway;
        String trash;

        System.out.println("Enter your guess");
        if(in.hasNextInt()) {
            guess = in.nextInt();
            in.nextLine();

            if(guess == random){
                System.out.println("You have guess the number correctly!");
            }else if(guess > random){
                guessAway = guess - random;
                System.out.println("The number was " + random);
                System.out.println("Your guess has above the number by " + guessAway);
            }else{
                guessAway = random - guess;
                System.out.println("The number was " + random);
                System.out.println("Your guess has below the number by " + guessAway);
            }
        }else{
            trash = in.nextLine();
            System.out.println("You entered an invalid guess: " + trash);
        }
    }
}
