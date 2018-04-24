/**
* Laboratório de Programação 2 - Lab 1
*
* @author Matheus Gusmão Lemos - 117210399
*/

import java.util.Scanner;

public class temp{
    public static void main(String[] args){

        int leituras = 0;
        int controle = 0;
        Scanner sc = new Scanner(System.in);

        while(controle == 0){
          int dado = sc.nextInt();
          if (dado == 0){
            controle += 1;
          }else{
              if(dado < 0){
                leituras += 1;
              }
          }
        }
        System.out.println(leituras);
    }
}
