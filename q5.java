/**
* Laboratório de Programação 2 - Lab 1
*
* @author Matheus Gusmão Lemos - 117210399
*/

import java.util.Scanner;

public class q5 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        String car1 = a.nextLine();
        if (car1.equals("+") || car1.equals("-") || car1.equals("*") || car1.equals("/")){
            double num1 = a.nextDouble();
            double num2 = a.nextDouble();
            switch(car1){
              case ("+"):
                System.out.println("RESULTADO: " + (num1 + num2));
                break;
              case ("-"):
                System.out.println("RESULTADO: " + (num1 - num2));
                break;
              case ("*"):
                System.out.println("RESULTADO: " + (num1 * num2));
                break;
              case ("/"):
                if (num2 == 0)
                  System.out.println("ERRO");
                else
                  System.out.println("RESULTADO: " + (num1 / num2));
                break;
              }
        } else {
            System.out.println("ENTRADA INVALIDA");
        }
    }
}
