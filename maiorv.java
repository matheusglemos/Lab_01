/**
* Laboratório de Programação 2 - Lab 1
*
* @author Matheus Gusmão Lemos - 117210399
*/

import java.util.Scanner;

public class maiorv{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b){
          System.out.println(a);
        }else{
          if (b > a){
            System.out.println(b);
          }else{
            System.out.println(a);
          }
        }
    }
}
