package program1;

class CustomException extends Exception{
    public CustomException(String m){ // Custom exception
        super(m);
    }

    public static void elementOutOfRange(int selection) throws CustomException{ // Throw custom exception, parameters
        if(selection > 10 || selection < 1){
            throw new CustomException("\tElement out of range - element selected is not within acceptable range (1-10).");
        }
    }
}
