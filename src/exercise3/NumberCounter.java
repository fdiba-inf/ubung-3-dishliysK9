package exercise3;

import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number = input.nextDouble();
        double pozitivni = 0;
        double negativni = 0;
        double sum = 0;
        double avrg;

        while (number != 0) {
          
          if (number > 0){
            pozitivni++;
          }else {
            negativni++;
          }
          number = input.nextDouble();
          sum = (pozitivni + negativni);
        }
        
        
        avrg = sum / (pozitivni + negativni);

        System.out.println("Positive numbers: " + pozitivni);
        System.out.println("Negative numbers: " + negativni);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avrg);
        
    }

}
