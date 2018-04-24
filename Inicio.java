/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Matheus Gusmão Lemos - 117210399
 */

 import java.util.Scanner;

public class Inicio{
    public static void main(String[] args){
    Scanner palavra = new Scanner(System.in);
    
      for(int i = 0; i < 5; i++){
          String nome = palavra.next();
          if (nome.charAt(0) == 'a'){
            System.out.println('s');
          } else {
              System.out.println('n');
          }
      }
    }
}
