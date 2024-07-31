import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Integer numero;
        String agencia;
        String nome;
        float saldo;

        Scanner sc = new Scanner(System.in);


            System.out.print("Escreva o número da conta: ");
            numero = sc.nextInt();
            sc.nextLine();

            System.out.print("Escreva o número da agência: ");
            agencia = sc.nextLine();

            System.out.print("Digite o nome da conta: ");
            nome = sc.nextLine();

            System.out.print("Escreva o saldo da conta: ");
            saldo = sc.nextFloat();

            System.out.printf("Olá [%s], obrigado por criar uma conta em nosso banco, sua agência é [%s], conta [%d] e seu saldo [%.2f] já está disponível para saque.%n", nome, agencia, numero, saldo);



            sc.close();

    }
}
