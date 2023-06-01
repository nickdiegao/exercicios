import java.util.Locale;
import java.util.Scanner;

public class cuscuz {
    
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        salsicha pao;

        System.out.print("Digite o número da conta: ");
        int number = sc.nextInt();

        System.out.print("Digite o nome do cliente: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Já existe algum valor na conta: (s/n)");
        char response = sc.next().charAt(0);

        if (response=='s'){
            System.out.print("Digite o valor inicial: ");
            double balance = sc.nextDouble();
            pao = new salsicha(number,name,balance);
        }
        else{
            pao = new salsicha(number,name);
        }

        System.out.println("");
        System.out.println(pao);
        System.out.println("");

        System.out.print("Digite um valor para depositar: ");
        double amount = sc.nextDouble();
        pao.deposito(amount);

    
        System.out.println("Conta atualizada!");
        System.out.println(pao);

        System.out.print("Digite um valor para retirar: ");
        amount = sc.nextDouble();
        pao.retirada(amount);

    
        System.out.println("Conta atualizada!");
        System.out.println(pao);






        sc.close();
    }
}
