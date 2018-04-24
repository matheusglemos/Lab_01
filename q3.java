/**
* Laboratório de Programação 2 - Lab 1
*
* @author Matheus Gusmão Lemos - 117210399
*/

import java.util.Scanner;

public class q3 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        float numero1 = a.nextFloat();
        float numero2 = a.nextFloat();
        float media = (numero1 + numero2)/2;
        if (media >= 7){
            System.out.println("pass: True!");
        } else {
              System.out.println("pass: False!");
        }
    }
}
