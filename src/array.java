import java.util.Scanner;
    public class array {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
    
            int[] num = new int[5];
            int soma = 0;
    
            System.out.println("Digite 5 números inteiros:");
            for (int i = 0; i < 5; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                num[i] = ler.nextInt();
                soma += num[i];  // SOMA +1
            }//fmm for

            System.out.println("A soma de todos os números é: " + soma);

        }//fim main
    }// fim class
    