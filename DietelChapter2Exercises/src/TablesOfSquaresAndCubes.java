import java.util.Scanner;

public class TablesOfSquaresAndCubes {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= input.nextInt();
        int aSquare=a*a;
        int aCube=a*a*a;
        System.out.println("Enter the second number");
        int b= input.nextInt();
        int bSquare=b*b;
        int bCube=b*b*b;
        System.out.println("Enter the third number");
        int c= input.nextInt();
        int cSquare=c*c;
        int cCube=c*c*c;
        System.out.println("Enter the fourth number");
        int d= input.nextInt();
        int dSquare=d*d;
        int dCube=d*d*d;
        System.out.println("Enter the fifth number");
        int e= input.nextInt();
        int eSquare=e*e;
        int eCube=e*e*e;
        System.out.println("Enter the sixth number");
        int f= input.nextInt();
        int fSquare=f*f;
        int fCube=f*f*f;
        System.out.println("Enter the seventh number");
        int g= input.nextInt();
        int gSquare=g*g;
        int gCube=g*g*g;
        System.out.println("Enter the eight number");
        int h= input.nextInt();
        int hSquare=h*h;
        int hCube=h*h*h;
        System.out.println("Enter the ninth number");
        int i= input.nextInt();
        int iSquare=i*i;
        int iCube=i*i*i;
        System.out.println("Enter the tenth number");
        int j= input.nextInt();
        int jSquare=j*j;
        int jCube=j*j*j;

        System.out.println("Number       Square            Cube" );
        System.out.printf( "%d        %10d           %5d%n",a,aSquare,aCube );
        System.out.printf( "%d        %10d           %5d%n",b,bSquare,bCube );
        System.out.printf( "%d        %10d           %5d%n",c,cSquare,cCube );
        System.out.printf( "%d        %10d           %5d%n",d,dSquare,dCube );
        System.out.printf( "%d        %10d           %5d%n",e,eSquare,eCube );
        System.out.printf( "%d        %10d           %5d%n",f,fSquare,fCube );
        System.out.printf( "%d        %10d           %5d%n",g,gSquare,gCube );
        System.out.printf( "%d        %10d           %5d%n",h,hSquare,hCube );
        System.out.printf( "%d        %10d           %5d%n",i,iSquare,iCube );
        System.out.printf( "%d       %10d            %5d%n",j,jSquare,jCube );




    }
}
