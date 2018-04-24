/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Matheus Gusmão Lemos - 117210399
 */

import java.util.Scanner;

public class Wally {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] nomes;
        String saida = " ";
        int controle = 0;

        while(controle != 1) {
            nomes = sc.nextLine().split(" ");
            if(nomes.length == 1 && nomes[0].equals("wally")) {
                controle += 1;
            } else {
                saida = "?";
                for(String nome : nomes) {
                    if(nome.length() == 5){
                        saida = nome;
                    }
                }
              System.out.println(saida);
              }
        }
    }
}
