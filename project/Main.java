import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1 = (int) (System.currentTimeMillis() % 90);
        int number2 = (int) (System.currentTimeMillis() / 90 % 90);


        // Create a Scanner

        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + "+" + number2 + " ? ");

        int answer = input.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
        if (answer == number1 + number2) {
            System.out.println("Bravo! You are correct!");
        } else {

            
            System.out.println("Sorry, you are wrong.");
        }
    }
}