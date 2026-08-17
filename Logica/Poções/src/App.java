import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new  Scanner (System.in);

        int n = sc.nextInt();
        int raras = 0;
        for (int i = 0; i < n; i++){
            int nivel = sc.nextInt();
            if (nivel % 5 == 0 && nivel >= 10 && nivel <= 50){
                raras++;
                
            }
        }
        System.out.println(raras);
    }
}
