import java.util.Scanner;

public class SaqueConta {
    public static void main(String[] args) {

        // Entrada de dados
        Scanner scanner = new Scanner(System.in);
        int saldoTotal = scanner.nextInt();
        int valorSaque = scanner.nextInt();

        //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.

        if(valorSaque > saldoTotal){
            System.out.println("Saldo insuficiente. Saque nao realizado!");
        }else{
            saldoTotal -= valorSaque;
            System.out.println("Saque realizado com sucesso! Novo saldo: " + saldoTotal);
        }
    }
}
