package exercise3;

import java.util.Scanner;

public class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
       System.out.println("Insert value fuer Winkel");
       double winkel = input.nextDouble();
       System.out.println("Insert Einheit fuer Winkel");
       char einheit = input.next().charAt(0);
       double Radiant;
       double Grad;
       do{
         if (einheit == 'r'){
           Radiant = (winkel * Math.PI) / 180;
           System.out.println("Angle: " +  Radiant + einheit);
         }else{
           Grad = (winkel * 180) / Math.PI;
           System.out.println("Angle: " + Grad + einheit);
         }
         winkel = input.nextDouble();
         einheit = input.next().charAt(0);
       }while(einheit == 'r' || einheit == 'd');


        
      }
    }       