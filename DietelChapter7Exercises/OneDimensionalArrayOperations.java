import java.lang.reflect.Array;
import java.util.Arrays;

public class OneDimensionalArrayOperations {
    public static void main(String[] args) {
        int [] array=new int[10];
        int [] arrayBonus={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[]a=new int[5];
        for(int array1:a){
            System.out.printf("%d%n",array1);
        }
        Arrays.fill(array,0);
        for(int array1:array){
            System.out.printf("%d",array1);
        }
        modify(arrayBonus);
        for(int array1:arrayBonus){
            System.out.printf("%d",array1);
        }
    }
    public static void modify(int[]array){
        for(int counter=0;counter<array.length;counter++){
            ++array[counter];
        }
    }
}
