package program1;

import java.util.ArrayList;


public class Output {
    public static void printArray(ArrayList<String> collection){ // Method for printing ArrayList

        System.out.print("ArrayList Collection Output");

        int count = 0;

        for(String s : collection){
            count += 1;
            System.out.printf("\n\t%d. %s",count,s);
        }

        System.out.print("\n\n");
    }

    public static void printElement(int selection, ArrayList<String> collection){ // Method for printing selected element
        
        try{
            CustomException.elementOutOfRange(selection);
            
            String element = collection.get(selection-1);
            
            System.out.printf("Element selected: %d. %s\n",selection,element);
        }catch(CustomException e){
            System.err.println("Out of Bounds\n" + e.getMessage());
        }
            

    }
}
