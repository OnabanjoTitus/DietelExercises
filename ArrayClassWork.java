
public class ArrayClassWork {

     private double scores;
     private int maximum = 0;
     private int minimum;
     private int maximumAdder = 0;
     private int minimumAdder=0;

     public double calculateSum(double[] scores) {
         for (int counter = 0; counter < scores.length; counter++) {
             this.scores += scores[counter];
         }
         return (this.scores);
     }

     public double calculateAverage(double[] scores) {
         for (int counter = 0; counter < scores.length; counter++) {
             this.scores += scores[counter];
         }

         return (this.scores / scores.length);
     }

     public int getTheMaximumNumber(int[] scores) {

         for (int counter = 0; counter < scores.length; counter++) {
                this.maximum=Math.max(scores[counter],maximum );
         }
         return this.maximum;
     }

     public int getTheMinimumNumber(int[] scores) {
         this.minimum = scores[0];
         for (int counter = 0; counter < scores.length; counter++) {
             this.minimum=Math.min(scores[counter],minimum );
         }
         return this.minimum;
     }

     public int getMaximumNumberCombination(int[] scores) {
         int sum=0;
         int min=scores[0];
         for (int counter =0;counter<scores.length;counter++)
         { min=Math.min(scores[counter],min);
             sum+=scores[counter];
        }
         this.maximumAdder= sum-min;
             return maximumAdder;
     }

     public int getMinimumNumberCombination(int[] scores) {
         int summation=0;
         int max=scores[0];
         for (int counter =0;counter<scores.length;counter++)
         {summation+=scores[counter];
             max=Math.max(scores[counter],max );
         }
         this.minimumAdder= summation-max;
         return minimumAdder;

     }
 }