package program1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    public static int userInput(){ // Method for user input, select element to see again

        System.out.print("Which element would you like to see again?\n\tSelect element number: ");

        Scanner scanner = new Scanner(System.in);
        String selection = scanner.nextLine();

        // Autoboxing & unboxing
        Integer boxedValue = Integer.valueOf(selection);
        int value = boxedValue;

        System.out.printf("\t\tUser has selected element #%d\n\n",value);

        scanner.close();

        return value;
    }

    public static void main(String [] args){

        // Create & add to ArrayList
        ArrayList<String> collection = new ArrayList<>();
        Collections.addAll(collection, 
        "Blue","Nebraska","Banana","Gaming","Superhero",
        "Green","Warrior","Baker","Monkey","Manga");

        Output.printArray(collection);
        int selection = userInput();
        Output.printElement(selection,collection);
    }
}
