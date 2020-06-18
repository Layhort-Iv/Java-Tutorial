package Exercise.ExceptionHandling;

import java.util.Scanner;

public class BadSubscriptCaught {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Olivia", "James", "Emily", "Emma", "Gabriel", "Lucas", "Sofia", "Luke", "Maria", "Alexander"};

        try{
            System.out.println("Please, enter an integer from 1 - 10 to display a name:");
            int number = sc.nextInt();
            System.out.println(names[number-1]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Oops! Your entered number is out of our range.");
        }
    }
}
