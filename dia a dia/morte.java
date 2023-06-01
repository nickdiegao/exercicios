import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class morte {

    public static void main(String[]args){
        List<polo> list = new ArrayList<>(); 

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos funcionários serão cadastrados? ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.printf("Funcionário %d: \n",i+1);
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            while(hasId(list, id)){
                System.out.println("Já registrado!");
                id = sc.nextInt();
            }
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salário: ");
            Double salary = sc.nextDouble();

            polo emp = new polo(id,name,salary);
            list.add(emp);
        }

        System.out.println("");
        System.out.print("Digite o ID do funcionário que receberá o aumento: ");
        int idSalary = sc.nextInt();

        polo emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

        if (emp==null){
            System.out.println("ID não existe!");
        }
        else{
            System.out.print("Digite a porcentagem do aumento: ");
            double percente = sc.nextDouble();
            emp.increaseSalary(percente);
        }

        System.out.println("Lista de funcionários: ");
        for(polo p:list){
            System.out.println(p);
        }

        sc.close();
    }
    
    public static boolean hasId(List<polo> list, int id){
        polo emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
    
}
