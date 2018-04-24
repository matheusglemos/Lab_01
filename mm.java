import java.util.Scanner;

public class mm{
    public static void main(String[] args){

        Scanner entradas = new Scanner(System.in);
        int maior = 0;
        int menor = 89898989;

        for(int i = 0; i < 5; i++){
            int numero = entradas.nextInt();
            if (numero > maior){
                maior = numero;
            }
            if (numero < menor){
              menor = numero;
            }
        }
        System.out.println(maior - menor);
    }
}
