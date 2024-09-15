import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner =  new Scanner(System.in).useLocale(Locale.US);
        
        int numeroConta;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Seja bem vindo!");
        System.out.println("Por favor insira seu nome para começar: ");
        nomeCliente = scanner.next();
        System.err.println("Digite o número da sua Agência: ");
        agencia = scanner.next();
        System.out.println("Digite o número da sua conta: ");
        numeroConta = scanner.nextInt();
        System.out.println("Insira o valor do seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque");



    }
}
