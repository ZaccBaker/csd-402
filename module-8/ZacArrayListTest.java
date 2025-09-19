import java.util.ArrayList;
import java.util.Scanner;


public class ZacArrayListTest {
    public static Integer max(ArrayList<Integer> list){
        
        if(list.size() == 0){
            return 0;
        }else{
            int max = 0;

            for(int value : list){ // Finds largest value
                if(value > max){
                    max = value;
                }
            }

            return max;
        }        
    }

    public static ArrayList<Integer> UserInput(){ // Method for getting integers from user, assigns to list

        // Declare objects
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("""
                Enter integer values for list
                \tOne value per line, or seperate by space
                \tEnter value of 0 to quit
                """);

        while(scanner.hasNextInt()){ // Loop user input
            
            int number = scanner.nextInt();

            if(number == 0){// Checks integer value, quits if 0
                break;
            }else{
                list.add(number);
            }
        }

        scanner.close();

        return list;
    }

    public static void main(String [] args){
        // Actual
        ArrayList<Integer> list = UserInput();
        int value = max(list);

        System.out.printf("\nUser Input ArrayList\n\tLargest Value: %d",value);
        
        // Additional Tests
        // // Additional arrays
        ArrayList<Integer> test_1 = new ArrayList<>();
        ArrayList<Integer> test_2 = new ArrayList<>();
        ArrayList<Integer> test_3 = new ArrayList<>();

        // // Add value to test
        test_1.add(1);
        test_1.add(123);
        test_1.add(300);

        test_2.add(321);
        test_2.add(122);
        test_2.add(50);

        test_3.add(3);
        test_3.add(6);
        test_3.add(11);

        // // Call max method
        int test_1_max = max(test_1);
        int test_2_max = max(test_2);
        int test_3_max = max(test_3);

        // // Output
        System.out.printf("""
                \n\nAdditional ArrayList Tests (Static)
                \tTest 1 Largest Value: %d
                \tTest 2 Largest Value: %d
                \tTest 3 Largest Value: %d
                """,test_1_max,test_2_max,test_3_max);
        
        

        

    }
}
