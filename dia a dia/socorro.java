import java.util.Locale;
import java.util.Scanner;

public class socorro {
    
    public static void main (String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        help pao;

        System.out.print("Digite o número da conta: ");
        int number = sc.nextInt();

        System.out.print("Digite o nome do cliente: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Já existe algum deposito? (s/n) ");
        char response = sc.next().charAt(0);
        if (response == 's'){
            System.out.print("Digite o valor inicial: R$");
            double deposito = sc.nextDouble();
            pao = new help(number, name, deposito);
        }
        else{
            pao = new help(number, name);
        }

        System.out.println("");
        System.out.println(pao);

        System.out.print("Digite o valor do deposito: ");
        double amount = sc.nextDouble();
        pao.deposit(amount);
        System.out.println("Conta atualizada:");
        System.out.println(pao);

        System.out.println("");
        System.out.print("Digite o valor da retirada: ");
        amount = sc.nextDouble();
        pao.retirada(amount);
        System.out.println("Conta atualizada:");
        System.out.println(pao);

        sc.close();
    }
}
