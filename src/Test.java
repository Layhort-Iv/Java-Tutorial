import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int QUART_PER_GALLON = 4;
        int quartsNeeded = 0, gallonsNeeded, extraQuarts;
        boolean isValid = false;

        while(!isValid){
            try{
                System.out.println("Enter quarts needed:");
                quartsNeeded = sc.nextInt();
                isValid = true;
            }
            catch (Exception e){
                sc.next();
                System.out.println("Please enter a numeric value!");
            }
        }

        gallonsNeeded = quartsNeeded / QUART_PER_GALLON;
        extraQuarts = quartsNeeded % QUART_PER_GALLON;
        System.out.println("Gallons: "+gallonsNeeded+", Extra Quarts: "+extraQuarts);










//        double conversion;
//        String userInput;
//
//        try{
//            System.out.println("Enter a floating point number: ");
//            userInput = sc.nextLine();
//            conversion = Double.parseDouble(userInput);
//        }
//        catch (NumberFormatException e){
//            System.out.println("The entered number was not a floating point.");
//            conversion = 0.0;
//        }
//
//        System.out.println("Your floating point number : "+conversion);




    }
}
