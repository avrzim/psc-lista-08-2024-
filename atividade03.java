import java.util.Scanner;

public class atividade03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, n3;

        System.out.print("Digite o primeiro número: ");
        n1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = input.nextInt();
        System.out.print("Digite o terceiro número: ");
        n3 = input.nextInt();

        soma(n1, n2, n3);

        input.close();
    }

    public static void soma(int n1, int n2, int n3){
        int soma = n1 + n2 + n3;
        System.out.println("A soma dos números é: " + soma);
    }
}