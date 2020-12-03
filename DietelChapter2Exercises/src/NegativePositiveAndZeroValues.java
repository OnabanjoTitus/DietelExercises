import java.util.Scanner;

public class NegativePositiveAndZeroValues {
    public static void main(String[] args) {
        int zero=0;
        int positive=0;
        int negative=0;

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the first value");
        int a = input.nextInt();
        System.out.println("Enter the second value");
         int b = input.nextInt();
        System.out.println("Enter the third value");
         int c = input.nextInt();
        System.out.println("Enter the fourth value");
        int d = input.nextInt();
        System.out.println("Enter the fifth value");
        int e = input.nextInt();

        if(a==0)
        { zero=zero+1;}
        if(a>0)
        {positive=positive+1;}
        if(a<0)
        {negative=negative+1;}

        if(b==0)
        { zero=zero+1;}
        if(b>0)
        {positive=positive+1;}
        if(b<0)
        {negative=negative+1;}

        if(c==0)
        { zero=zero+1;}
        if(c>0)
        {positive=positive+1;}
        if(c<0)
        {negative=negative+1;}

        if(d==0)
        { zero=zero+1;}
        if(d>0)
        {positive=positive+1;}
        if(d<0)
        {negative=negative+1;}

        if(e==0)
        { zero=zero+1;}
        if(e>0)
        {positive=positive+1;}
        if(e<0)
        {negative=negative+1;}

        System.out.println("The number of zeros is "+zero);
        System.out.println("The number of positives is "+positive);
        System.out.println("The number of negatives is "+negative);
        }
    }

