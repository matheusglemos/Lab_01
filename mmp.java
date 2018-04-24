import java.util.Scanner;

public class mmp{
    public static void main(String[] args){

        Scanner entradas = new Scanner(System.in);
        String maior = " ";
        String menor = "sbisabisanaddraaqsasa ";

        for (int i = 0; i < 5; i++){
            String palavras = entradas.nextLine();
            if (palavras.length() < menor.length()){
              menor = palavras;
            }
            if (palavras.length() > maior.length()){
              maior = palavras;
            }
        }
        System.out.println(menor);
        System.out.println(maior);
    }
}
