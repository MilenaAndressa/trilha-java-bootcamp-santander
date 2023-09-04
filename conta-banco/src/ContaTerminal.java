import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, insira o número da conta.");
        numeroConta = input.nextInt();

        //utilizando nextLine() aqui, pois o nextInt() não pega a quebra de linha, assim, inserindo esse nextLine() resolverá este problema
        input.nextLine();

        System.out.println("Por favor, digite o número da agência.\nInclua hífen caso tenha.");
        agencia = input.nextLine();

        System.out.println("Por favor, digite o nome completo.");
        nomeCliente = input.nextLine();

        System.out.println("Por favor, digite seu saldo.");
        saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso" +
                " banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + "" +
                " já está disponível para saque.");
    }
}