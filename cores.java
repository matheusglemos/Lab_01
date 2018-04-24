/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Matheus Gusmão Lemos - 117210399
 */

 import java.util.Scanner;

 public class cores{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();

        if(r < 128 || g < 128 || b < 128){
            System.out.println("PRETO");
        } else {
          if (r >= 128 && g >= 128 && b >= 128){
            System.out.println("BRANCO");
          }
        }
    }
 }
