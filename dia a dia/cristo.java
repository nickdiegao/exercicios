import java.util.Locale;
import java.util.Scanner;

public class cristo {
    
    public static void main(String[]args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CurrencyConverter kill = new CurrencyConverter();

        System.out.print("Digite o valor do dólar: $");
        kill.dolar = sc.nextDouble();

        System.out.print("Quantos dólares serão comprados? $");
        kill.real = sc.nextDouble();

        double kys = kill.conversor() + kill.IOF();

        System.out.printf("O total a ser pago em reais: R$%.2f%n",kys);

        sc.close();
    }
}
