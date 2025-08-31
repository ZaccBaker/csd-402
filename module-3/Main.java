public class Main {
    public static void main(String [] args){

        int row = 7;
        int width = 4;

        // Total width of bottom row
        int maxWidth = (row * 2 - 1) * width;

        for (int i = 0; i < row; i++){

            // Formatting left padding
            int leftPad = row - i - 1;
            int leftPadWidth = leftPad * width;

            // Left padding white spaces
            for (int s = 0; s < leftPad; s++) {
                System.out.printf("%" + width + "s", "");
            }


            // Numbers increasing
            for (int n = 0; n <= i; n++){

                System.out.printf("%" + width + "d", (int) Math.pow(2, n));

            }

            // Numbers decreasing
            for (int n = i - 1; n >= 0; n--){

                System.out.printf("%" + width + "d", (int) Math.pow(2, n));

            }

            // Calculating row width
            int rowWidth = (2 * i + 1) * width;

            // Right padding
            int spacesNeeded = maxWidth - (leftPadWidth + rowWidth);
            System.out.print(" ".repeat(Math.max(0, spacesNeeded)));

            System.out.println("@");
            
        }
    }
}
