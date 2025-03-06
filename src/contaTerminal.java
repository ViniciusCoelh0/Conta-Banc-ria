import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, qual o seu nome?");
        String name = sc.next();

        System.out.println("Olá "+ name + ". Vamos criar uma conta.");

        System.out.println("Vamos começar:");
        System.out.println("Digite o número da Agência: ");
        String agencia = sc.next();

        System.out.println("Digite o saldo da sua conta: ");
        double saldo = sc.nextDouble();
        String saldoFormate = String.format("%,.3f", saldo);

        String[][] tabela = {
            {"Nome", "Agencia", "Saldo"},
            {name, agencia, saldoFormate}
        };

        System.out.println("Muito bem, esses são os seus dados: ");
        
        for(String[] linha : tabela){
            for(String coluna : linha){
                System.out.print(coluna + "\t"); // Tabulação para separar colunas
            }
            System.out.println();
        }
    }
}
