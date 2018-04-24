import java.util.Scanner;

public class teste{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double base = sc.nextDouble();
    double altura = sc.nextDouble();

    double area = (base * altura) / 2;

    System.out.println("A area e: " + area);
  }
}
