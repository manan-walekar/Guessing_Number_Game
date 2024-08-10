import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int randomnumber;
        int number;

        Scanner scan = new Scanner(System.in);

        Random random = new Random();
        randomnumber = random.nextInt(100) - 1;

        // System.out.println("RANDOM NO. IS = " + randomnumber);
        int trycount = 0;
        while (true) {
            System.out.println("Guess the number from (1-100) : ");
            number = scan.nextInt();
            // System.out.println(number);
            trycount++;

            if (randomnumber == number) {
                System.out.println("HURRAY ! YOU WIN");
                System.out.println("IT TOOK YOU " + trycount + " TRIES :)");
                break;
            }

            else if (randomnumber > number) {
                System.out.println("NOPE THE NUMBER IS GREATER. TRY AGAIN.");
                System.out.println("");
            }
            else if(number>100){
                System.out.println("Number is Invalid !");
                System.out.println("Restart Again");
                break;
            }

            else {
                System.out.println("NOPE THE NUMBER IS SMALLER. TRY AGAIN.");
                System.out.println("");
            }
        }

    }
}
