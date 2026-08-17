import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);

        int[][] numeros = new int[5][3];

        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                numeros[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("======= RESULTADO =======");
        for (int i = 0; i < numeros.length; i++){
            System.out.print("[ ");
            for (int j = 0; j < numeros[i].length; j++){
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println("]");
        }

        sc.close();
    }
}
