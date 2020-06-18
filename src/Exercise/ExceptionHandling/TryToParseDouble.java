package Exercise.ExceptionHandling;

import java.util.Scanner;

public class TryToParseDouble {
    public static void main(String[] args) {
        String userInput;
        Scanner sc = new Scanner(System.in);
        double conversion;

        try{
            System.out.println("Enter a floating point number >>");
            userInput = sc.nextLine();
            conversion = Double.parseDouble(userInput);
        }
        catch (NumberFormatException e){
            System.out.println("The number you entered was not a floating point.");
            conversion = 0.0;
        }
        System.out.println("Your floating point number: "+conversion);
    }
}
