import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        // TODO: Conhecer e Importar a Classe Scanner;
        // Scanner já foi importado acima

        // Exibir as mensagens para o nosso Usuário e obter os dados digitados
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por Favor, Digite o Número da Conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Por Favor, Digite o Número da Agência !");
        String agencia = scanner.nextLine();

        System.out.println("Por Favor, Digite o Nome do Cliente:");
        String nome = scanner.nextLine();

        System.out.println("Por Favor, Digite o Saldo:");
        double saldo = scanner.nextDouble();

        // Exibir a Mensagem Conta Criada;
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}

