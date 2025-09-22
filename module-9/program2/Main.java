package program2;

import java.util.Random;
import java.util.ArrayList;

public class Main {

    public static ArrayList<Integer> randomNumbers(){ // Generate random numbers, add to ArrayList
        
        Random random = new Random();
        ArrayList<Integer> collection = new ArrayList<>();
        
        for(int i=0; i<10; i++){
            int randomNum = random.nextInt(100);
            collection.add(randomNum);
        }

        return collection;
    }

    public static void main(String [] args){

        String file_name = "data.file.txt";
        
        Exports.createFile(file_name);
        ArrayList<Integer>collection = randomNumbers();
        Exports.writeFile(file_name, collection);
        Exports.readFile(file_name);
    }
}
