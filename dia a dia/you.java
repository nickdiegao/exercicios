import java.util.Scanner;
import java.util.Locale;

public class you {
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][i]+" ");
            }
        }

        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]<0){
                    count++;
                }
            }
        }
        System.out.println("Números negativos: "+count);

        sc.close();
    }
}
