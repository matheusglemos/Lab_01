/**
* Laboratório de Programação 2 - Lab 1
*
* @author Matheus Gusmão Lemos - 117210399
*/

import java.util.Scanner;

public class q6 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        String[] b = a.nextLine().split(" ");
        int[] c = new int[b.length];

        int cont = 0;
        int soma = 0;
        for (int i = 0;i < b.length; i++){
            int num = Integer.parseInt(b[i]);
            soma += num;
            cont += 1;
            c[i] = num;
        }

        float media = soma / cont;

        for (int numero : c){
            if (numero > media){
                System.out.print(numero + " ");
            }
        }
  }
}
