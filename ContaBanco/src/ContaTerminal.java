import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int numero;
        String agencia, nome;
        double saldo;
        
        System.out.println("Por favor, digite o nome do cliente!");
        nome = sc.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        numero = sc.nextInt();

        System.out.println("Por favor, digite a Agência!");
        agencia = sc.next();

        System.out.println("Por favor, digite o saldo!");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}