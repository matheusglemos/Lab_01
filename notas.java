/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Matheus Gusmão Lemos - 117210399
 */

 import java.util.Scanner;
 import java.util.ArrayList;

 public class notas{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> notas = new ArrayList<Integer>();
        int soma = 0;
        int media = 0;
        int qnt = 0;
        int maiores = 0;
        int menores = 0;
        int maior = 0;
        int menor = 8998994;

        while (true){
            String[] a = entrada.nextLine().split(" ");
            if(a[0].equals("-")){
                break;
            }
            int num = Integer.parseInt(a[1]);
            notas.add(num);
        }

        for(int i = 0; i < notas.size(); i++){
            soma += notas.get(i);
            qnt += 1;
        }
        media = soma / qnt;

        for(int i = 0; i < notas.size(); i++){
          if (notas.get(i) >= 700){
            maiores += 1;
          } else{
            menores += 1;
          }
            if(notas.get(i) > maior){
                maior = notas.get(i);
            }
            if(notas.get(i) < menor){
                menor = notas.get(i);
            }
        }
        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
        System.out.println("media: " + media);
        System.out.println("acima: " + maiores);
        System.out.println("abaixo: " + menores);
      }
}
