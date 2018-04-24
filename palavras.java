/**
* Laboratório de Programação 2 - Lab 1
*
* @author Matheus Gusmão Lemos  117210399
*/

import java.util.Scanner;

public class palavras{
    public static void main(String[] args){

        Scanner palavra = new Scanner(System.in);
        char a = '1';
        char b = '1';
        int controle = 0;
        int tam = 0;

        for(int i = 0; i < 2; i++){
            String nome = palavra.nextLine();
            tam = nome.length();
            if(nome.charAt(0) != a){
                a = nome.charAt(0);
            } else {
                controle += 1;
            }

            if(nome.charAt(tam - 1) != b){
                b = nome.charAt(tam - 1);
            } else {
                controle += 1;
            }
        }
        if (controle == 2){
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}
