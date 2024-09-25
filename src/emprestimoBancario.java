import java.util.Scanner;

public class emprestimoBancario {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor do empréstimo:");
        double emprestimo = ler.nextDouble();

        System.out.println("Digite o número de parcelas: ");
        int numeroParcelas = ler.nextInt();

        System.out.println("Digite o salário do solicitante: ");
        double salarioSolicitante = ler.nextDouble();

        System.out.println();
        double valorParcela = emprestimo / numeroParcelas;

        if (valorParcela <= salarioSolicitante * 0.30) {
            System.out.println("Empréstimo aprovado.");
        } else {
            System.out.println("Negado. O valor da parcela do empréstimo excede 30% do salário do solicitante.");
        }
    }
}

