import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
public class habbo{

    public static void main(String[]args){
        List<String> list = new ArrayList<>();
        System.out.println("---------------------------------");
        list.add("Maria");
        list.add("Nicholas");
        list.add(1,"Roberval");
        System.out.println("---------------------------------");
        System.out.println(list.size());
        for (String x : list){
            System.out.println(x);
        }   
        System.out.println("---------------------------------");
        list.removeIf(x -> x.charAt(0)=='M');
        System.out.println(list.size());
        for (String x : list){
            System.out.println(x);
        }   
        System.out.println("---------------------------------");
        System.out.println("List index of BOB: "+list.indexOf("bob"));
        System.out.println("List index of Nicholas: "+list.indexOf("Nicholas"));
        System.out.println("---------------------------------");


        List<String> result = list.stream().filter(x -> x.charAt(0)=='N').collect(Collectors.toList());
        for (String x : result){
            System.out.println(x);
        }   
        System.out.println("---------------------------------");
        String name = list.stream().filter(x -> x.charAt(0)=='R').findFirst().orElse(null);
        System.out.println(name);
    }

}