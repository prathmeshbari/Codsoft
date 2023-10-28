import java.util.*;

class guess {
    void iscorrect() {
        Random rn = new Random();
        int num1 = rn.nextInt(100);
        int i = 0;

        while (i < 10) {
            System.out.println("Enter your number : ");
            Scanner sc = new Scanner(System.in);
            int num2 = sc.nextInt();
            i++;

            if (num1 < num2) {
                System.out.println("Your Guess is high");
                System.out.println("Enter the smaller number");
            } else if (num1 > num2) {
                System.out.println("Your Guess is low");
                System.out.println("Enter the Higher number");
            } else if (num1 == num2) {
                System.out.println("Congratulation !! You Guess the right number");
                break;
            } else if (i > 10) {
                System.out.println("You attempt is finished");
            }
        }
        System.out.println("Total number of guess is " + (i));
    }

}

public class Task1 {
    public static void main(String[] args) {

        int j = 10;
        while (j <= 10) {
            System.out.println("Welcome in number guessing Game");

            guess gs = new guess();
            gs.iscorrect();
            System.out.println("Are you want to play again");
            System.out.println("1.Yes");
            System.out.println("2.No");
            Scanner se = new Scanner(System.in);
            int ch = se.nextInt();
            switch (ch) {
                case 1:

                    gs.iscorrect();
                    j = 5;
                    break;
                case 2:

                    j = 15;
                    System.out.println("Thanks for Playing with Us");
                    break;

                default:
                    j++;

            }

        }
    }
}