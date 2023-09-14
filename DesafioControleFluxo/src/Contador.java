import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int primeiroNumero;
        int segundoNumero;

        try {
            System.out.println("Digite o primeiro número: ");
            primeiroNumero = input.nextInt();

            System.out.println("Digite o segundo número: ");
            segundoNumero = input.nextInt();

            contar(primeiroNumero,segundoNumero);

        }catch (InputMismatchException e1){
            System.err.println("Digite um número inteiro válido.");
        }catch (ParametrosInvalidosException e2){
            System.err.println("Não é permitido que o primeiro número seja maior que o segundo.");
        }finally {
            System.out.println("Fim do programa.");
        }

    }
    static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException{
        if (primeiroNumero > segundoNumero){
            throw new ParametrosInvalidosException();
        }
        for (int i = 1; i <= (segundoNumero - primeiroNumero); i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}
