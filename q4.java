/**
* Laboratório de Programação 2 - Lab 1
*
* @author Matheus Gusmão Lemos - 117210399
*/

import java.util.Scanner;

public class q4 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int num1 = a.nextInt();
        int num2 = a.nextInt();
        int num3 = a.nextInt();
        int num4 = a.nextInt();
        if (num1 < num2 && num2 < num3 && num3 < num4){
            System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
        } else if (num1 > num2 && num2 > num3 && num3 > num4){
            System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
        } else{
            System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
        }
    }
}
