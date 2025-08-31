import java.util.Arrays;

public class Main {
    // Short method
    public static short average(short [] array){
        short sum = 0;
        for (short value : array){
            sum += value;
        }
        return sum;
    }

    // Int method
    public static int average(int [] array){
        int sum = 0;
        for (int value : array){
            sum += value;
        }
        return sum;

    }

    // Long method
    public static long average(long [] array){
        long sum = 0;
        for (long value : array){
            sum += value;
        }
        return sum;

    }

    // Double method
    public static double average(double [] array){
        double sum = 0;
        for (double value : array){
            sum += value;
        }
        return sum;

    }

    public static void main(String[] args){

        // Array statements
        short[] shortArray = {2,4,6,8,10};
        int[] intArray = {4,8,12,16,20,24};
        long[] longArray = {3000L,6000L,9000L};
        double[] doubleArray = {1,2,3,4,5,6,7,8,9,10};

        // Array outputs
        System.out.println("Short Array\n" + "Contents: " + Arrays.toString(shortArray) + "\nAverage: " + average(shortArray) + "\nLength: " + shortArray.length);

        System.out.println("\nInt Array\n" + "Contents: " + Arrays.toString(intArray) + "\nAverage: " + average(intArray) + "\nLength: " + intArray.length);
        
        System.out.println("\nLong Array\n" + "Contents: " + Arrays.toString(longArray) + "\nAverage: " + average(longArray) + "\nLength: " + longArray.length);

        System.out.println("\nDouble Array\n" + "Contents: " + Arrays.toString(doubleArray) + "\nAverage: " + average(doubleArray) + "\nLength: " + doubleArray.length);
        


    }
}
