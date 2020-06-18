package Exercise.ExceptionHandling;

import java.util.Scanner;

public class QuartsToGallonsWithException {
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
    }
}
