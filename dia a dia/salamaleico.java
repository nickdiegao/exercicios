import java.util.Locale;
import java.util.Scanner;

public class salamaleico {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();

		pao[] vetor = new pao[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %dº pessoa: ",i+1);
			double alt = sc.nextDouble();
			System.out.print("Gênero: ");
            sc.nextLine();
			char sexo = sc.next().charAt(0);
			vetor[i] = new pao(sexo, alt);
        }

		double menor = vetor[0].getAlt();
		double maior = vetor[0].getAlt();
		double soma = 0;
		double media = 0;
		int count = 0;
        int ct = 0;

		for (int i = 0; i < n; i++) {
			if (vetor[i].getAlt() > maior) {
                maior = vetor[i].getAlt();
            }
		}

        for (int i = 0; i < n; i++) {
			if (vetor[i].getAlt() < menor) {
                menor = vetor[i].getAlt();
            }
		}

        System.out.println("Maior altura = "+maior);
        System.out.println("Menor altura = "+menor);

        for (int i = 0; i < n; i++) {
			if(vetor[i].getSexo()=='F'){
                soma += vetor[i].getAlt();
                ct++;
            }
            else{
                count++;
            }
        }

        media = soma/ct;

        System.out.println("Média da altura das mulheres: "+media);
        System.out.println("Número de homens: "+count);

        sc.close();
    }
}


