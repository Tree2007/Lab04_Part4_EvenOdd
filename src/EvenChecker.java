import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //variables
        int userInt;

        //data collection
        System.out.println("Please input a positive integer");
        userInt = scan.nextInt();

        //process

        if (userInt % 2 == 0) {
            System.out.println("Your number is even");


        }
        else
            System.out.println("Your number is odd");


    }
}