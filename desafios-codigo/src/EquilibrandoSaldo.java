import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldoBancario = input.nextDouble();
        double deposito = input.nextDouble();
        double saque = input.nextDouble();

        System.out.printf("Saldo atualizado na conta: %.1f\n",calculaSaldo(saldoBancario,deposito,saque));
        System.out.println(String.format("Saldo atualizado na conta: %.1f", calculaSaldo(saldoBancario,deposito,saque)));
    }

    static double calculaSaldo(double saldoBancario, double deposito, double saque){
        double saldoFinal = 0.0;
        saldoFinal = (saldoBancario + deposito) - saque;
        return saldoFinal;
    }
}
