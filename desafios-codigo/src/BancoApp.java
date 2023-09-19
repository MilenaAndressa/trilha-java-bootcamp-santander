import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.pow;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();

        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.

        double valorFinal = valorInicial * pow((1 + taxaJuros),periodo);

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));

        scanner.close();
    }
}