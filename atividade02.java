import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args) {
        escada();
    }

    public static void escada(){
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Digite o número de linhas que a escada terá: ");
        n = input.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        input.close();
    }
}
