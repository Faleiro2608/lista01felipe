import java.util.Scanner;

public class numeroCPF {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);

        System.out.println("Digite os 11 números do CPF: ");
        String CPF = ler.nextLine();

        if (CPF.length() == 11 & CPF.matches("\\d+")) {
            String CPFformatado = CPF.substring(0, 3) + "." 
                                + CPF.substring(3, 6) + "." 
                                + CPF.substring(6, 9) + "-" 
                                + CPF.substring(9, 11);
                                System.out.println();
                                System.out.println("O CPF " + CPFformatado+ " é válido.");                    
        }//fim if
        else{
            System.out.println("CPF Inválido.");
        }//fim else
    }//fim main
}//fim class
