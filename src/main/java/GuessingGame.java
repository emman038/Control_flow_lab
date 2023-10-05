import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int compGuess = 5;

        System.out.println("Guess the number I am thinking:");

        int userGuess = Integer.parseInt(reader.nextLine());

        if (compGuess == userGuess) {
            System.out.println("Congrats, you guessed it right!!");
        } else if (compGuess > userGuess) {
            System.out.println("Too low!");
        } else {
            System.out.println("Too high!");
        }
    }
}

