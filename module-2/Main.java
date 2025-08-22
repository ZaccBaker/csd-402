import java.util.Scanner;

public class Main{
    public static void main(String [] args){

        System.out.print("Choice Prompt\n\t1. Rock\n\t2. Paper\n\t3. Scissors\nEnter number to select: ");
        
        Scanner input = new Scanner(System.in);
        int user_selection = input.nextInt();

        int computer_selection = (int)((Math.random() * 3) + 1);

        boolean user_result_01 = user_selection == 1;
        boolean user_result_02 = user_selection == 2;
        boolean user_result_03 = user_selection == 3;

        boolean computer_result_01 = computer_selection == 1;
        boolean computer_result_02 = computer_selection == 2;
        boolean computer_result_03 = computer_selection == 3;

        String user_sign = null;
        String computer_sign = null;

        if(user_result_01){
            user_sign = new String("Rock");
        }
        if(user_result_02){
            user_sign = new String("Paper");
        }
        if(user_result_03){
            user_sign = new String("Scissors");
        }

        if(computer_result_01){
            computer_sign = new String("Rock");
        }
        if(computer_result_02){
            computer_sign = new String("Paper");
        }
        if(computer_result_03){
            computer_sign = new String("Scissors");
        }

        System.out.printf("\nUser selected: %s (%d)\n", user_sign, user_selection);
        System.out.printf("Computer selection: %s (%d)\n\n", computer_sign, computer_selection);

        int result = (3 + user_selection - computer_selection) % 3;

        if(result == 1){
            System.out.printf("User wins\n\t%s beats %s\n",user_sign,computer_sign);
        }else if (result == 2){
            System.out.printf("Computer wins\n\t%s beats %s\n",computer_sign,user_sign);
        }else{
            System.out.printf("Match is tied\n\t%s ties %s\n",computer_sign,user_sign);
        }

    }
}