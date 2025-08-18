import java.util.Scanner;

public class Energy{
    
    public static void main(String [] args){

        Scanner user = new Scanner(System.in);

        // Water input
        System.out.print("Enter amount of water (kg): ");
        Double water = user.nextDouble();

        // Initial temp input
        System.out.print("Enter initial temperature (C): ");
        Double initialTemp = user.nextDouble();

        // Final temp input
        System.out.print("Enter final temperature (C): ");
        Double finalTemp = user.nextDouble();

        // Calculate energy (should be 4190?)
        Double energy = water * (finalTemp - initialTemp) * 4184;
        System.out.print("Energy needed (Joules): " + energy);

    }
}