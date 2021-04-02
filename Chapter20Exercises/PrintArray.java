import java.util.Arrays;

public class PrintArray {

    public  void printingArray(int[] intArray, int start, int stop) {
     try {
         int count=0;

        int arrayLength=stop-start+1;
        int[]integerArray=new int[arrayLength];
        for (int i = start; i <stop+1 ; i++) {
            integerArray[count]=intArray[i];
            count++;
        }
        System.out.println(Arrays.toString(integerArray));}
     catch (ArrayIndexOutOfBoundsException invalidSubscriptException ){
         throw new InvalidSubScriptException("The Subscript is Invalid");
     }

    }
    public  void printingArray(Integer[] intArray, int start, int stop) {
      try{  int count=0;
        int arrayLength=stop-start+1;
        Integer[]integerArray=new Integer[arrayLength];
        for (int i = start; i <stop+1 ; i++) {
            integerArray[count]=intArray[i];
            count++;
        }
        System.out.println(Arrays.toString(integerArray));}
      catch (ArrayIndexOutOfBoundsException invalidSubscriptException ){
          throw new InvalidSubScriptException("The Subscript is Invalid");
      }
    }
    public static class InvalidSubScriptException extends ArrayIndexOutOfBoundsException{
        public InvalidSubScriptException(String message){
            super(message);
        }

    }
}
