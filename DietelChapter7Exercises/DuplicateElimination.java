import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int []array=new int [5];
        int counter=0;
        System.out.printf("Enter the Number 1:%n");
        int number=input.nextInt();
        while(counter<5){
            for(int count=0;count<array.length;count++){
                if(array[count]==number){
                    break;
                }
                if(array[count]!=number && array[count]==0){
                    array[count]=number;
                    counter++;
                    break;
                }
            }
            if(counter==array.length){
                break;
            }
            System.out.printf("Enter the Number%d:%n",counter+1);
            number=input.nextInt();
        }
        for(int count:array){
            System.out.printf("%d%n",count);
        }
    }
}
