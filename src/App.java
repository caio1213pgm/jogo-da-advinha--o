import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int aleatorio = (int) (Math.random() * 100 + 1);
       int palpite = -1;
       int tentativa = 0;

       System.out.println("Jogo da advinhação");
       System.out.println("Tente advinhar o número entre 1 a 100");

       while (palpite != aleatorio) {

        System.out.println("Digite seu palpite");
        palpite = sc.nextInt();
        tentativa++;

        if (palpite < aleatorio) {
            System.out.println("Tente um número mais alto");
        }
        else if (palpite > aleatorio) {
            System.out.println("Tente um número mais baixo");
        }
        else {
            System.out.printf("Você acertou o número em %d tentativas", tentativa);
        }
        
       }
    }
}
