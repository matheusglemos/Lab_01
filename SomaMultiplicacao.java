/**
* Laboratório de Programação 2 - Lab 1
*
* @author Matheus Gusmão Lemos  117210399
*/

import java.util.Scanner;

public class SomaMultiplicacao {
  public static void main(String[] args){
    Scanner a = new Scanner(System.in);
    int b = a.nextInt();
    float c = a.nextFloat();
    float soma = (b + c);
    float multiplicacao = (b * c);
    System.out.println(soma);
    System.out.println(multiplicacao);
  }
}
