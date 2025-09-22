package program2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exports {
    public static void createFile(String file_name){ // Create file, if does not exist
        try{
            File file = new File(file_name);
            if(file.createNewFile()){
                System.out.printf("\nFile created - %s",file.getName());
            }else{
                System.out.print("\nFile already exists.");
            }

        }catch(IOException e){
            System.out.printf("\nException encountered: %s",e);
        }
    }

    public static void writeFile(String file_name, ArrayList<Integer> collection){ // Write to file
        try{
            FileWriter writer = new FileWriter(file_name);
            
            for(int num : collection){
                writer.write(String.valueOf(num) + " ");
            }

            writer.close();
        }catch(IOException e){
            System.out.printf("\nException encountered: %s",e);
        }
    }

    public static void readFile(String file_name){ // Read file, output contents
        try(Scanner reader = new Scanner(new File(file_name))){ 
            while(reader.hasNextLine()){

                String line = reader.nextLine();
                System.out.printf("\n\nFile Output\n\t%s",line);
            }
        }catch(FileNotFoundException  e){
            System.out.printf("\nException encountered: %s",e);
        }
    }
}
