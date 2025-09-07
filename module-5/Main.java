public class Main{

    public static int [ ] locateLargest (double [ ][ ] arrayParam){
        int[] location = new int[2]; // Set to two elements
        double max = arrayParam[0][0]; // Default max

        for(int i=0; i < arrayParam.length; i++){ // First index, row
            for(int k=0; k < arrayParam[i].length; k++){ // Second index, column
                if (arrayParam[i][k] > max){ // Compare current arrayParam against max, larger
                    max = arrayParam[i][k];
                    location[0] = i;
                    location[1] = k;
                }
            }
        }

        return location;
    }

    public static int [ ] locateLargest (int [ ][ ] arrayParam){
        int[] location = new int[2]; // Set to two elements
        int max = arrayParam[0][0]; // Default max

        for(int i=0; i < arrayParam.length; i++){ // First index, row
            for(int k=0; k < arrayParam[i].length; k++){ // Second index, column
                if (arrayParam[i][k] > max){ // Compare current arrayParam against max, larger
                    max = arrayParam[i][k];
                    location[0] = i;
                    location[1] = k;
                }
            }
        }

        return location;
    }

    public static int [ ] locateSmallest (double [ ][ ] arrayParam){
        int[] location = new int[2]; // Set to two elements
        double min = arrayParam[0][0]; // Default min

        for(int i=0; i < arrayParam.length; i++){ // First index, row
            for(int k=0; k < arrayParam[i].length; k++){ // Second index, column
                if (arrayParam[i][k] < min){ // Compare current arrayParam against min, smaller
                    min = arrayParam[i][k];
                    location[0] = i;
                    location[1] = k;
                }
            }
        }

        return location;
    }

    public static int [ ] locateSmallest (int [ ][ ] arrayParam){
        int[] location = new int[2]; // Set to two elements
        int min = arrayParam[0][0]; // Default min

        for(int i=0; i < arrayParam.length; i++){ // First index, row
            for(int k=0; k < arrayParam[i].length; k++){ // Second index, column
                if (arrayParam[i][k] < min){ // Compare current arrayParam against min, smaller
                    min = arrayParam[i][k];
                    location[0] = i;
                    location[1] = k;
                }
            }
        }

        return location;
    }

    public static void main(String [] args){

        int[][] intArray = {
            {5,1,3},
            {9,2,6},
            {7,4,8}
        };

        double[][] doubleArray = {
            {4.1,8.5,1.7},
            {9.5,7.8,5.9},
            {8.8,7.2,9.9}
        };

        int[] intLargest = locateLargest(intArray);
        int[] intSmallest = locateSmallest(intArray);
        int[] doubleLargest = locateLargest(doubleArray);
        int[] doubleSmallest = locateSmallest(doubleArray);

        System.out.print("Locations of Arrays\n");
        System.out.printf("\tLargest int location: [%d, %d]\n",intLargest[0],intLargest[1]);
        System.out.printf("\tSmallest int location: [%d, %d]\n\n",intSmallest[0],intSmallest[1]);
        System.out.printf("\tLargest double location: [%d, %d]\n",doubleLargest[0],doubleLargest[1]);
        System.out.printf("\tSmallest double location: [%d, %d]\n\n",doubleSmallest[0],doubleSmallest[1]);

    }
}