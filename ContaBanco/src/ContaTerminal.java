
import java.util.Scanner;



public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numero;
        String agencia;
        String nome;
        double saldo;

        System.out.println("Bem vindo! Vamos criar sua nova conta.");
        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scan.nextLine();

        System.out.println("Digite o número da conta: ");
        numero = Integer.parseInt(scan.nextLine());
        
        System.out.println("Agora, digite o saldo da conta:");
        saldo = Double.parseDouble(scan.nextLine());

        System.out.println("Por último, digite o nome do titular completo: ");
        nome = scan.nextLine();

        scan.close();


        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco. Sua Agência é " + agencia + " e conta " + numero + ". Seu saldo de R$" + saldo + " já está disponível para saque.");

        
        
    }
}
