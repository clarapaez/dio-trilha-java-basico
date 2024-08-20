
import java.util.Scanner;



public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Bem vindo! Vamos criar sua nova conta.");
        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scan.next();

        System.out.println("Digite o número da conta");
        numero = scan.nextInt();

        System.out.println("Agora, digite o nome do titular completo: ");
        nomeCliente = scan.next();

        System.out.println("Por último, digite o saldo da conta:");
        saldo = Double.parseDouble(scan.nextLine());

        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua Agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scan.close();
        
    }
}
