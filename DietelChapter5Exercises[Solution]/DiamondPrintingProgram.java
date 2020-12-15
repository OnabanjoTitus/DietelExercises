public class DiamondPrintingProgram {
    public static void main(String[] args) {
        int diamond_size = 10;
        int under_diamond=0;


        for (int counter = 1; counter < diamond_size; counter += 2) {
            if(counter%2>0){
                for(int spacer=10;spacer>counter;spacer--){
                    System.out.printf(" ");
                }
                for(int diamond=0;diamond<counter;diamond++){
                System.out.printf("*");
                }
            }
            System.out.println();
        }

        for (int counter = 7; counter >under_diamond; counter -= 2) {
            for(int spacer=10;spacer>counter;spacer--){
                System.out.printf(" ");
            }
            for(int diamond=0;diamond<counter;diamond++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
