import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.println("=== Soma Dinâmica ===");

                System.out.print("Digite o primeiro número: ");
                int n1 = scanner.nextInt();

                System.out.print("Digite o segundo número: ");
                int n2 = scanner.nextInt();

                Soma soma1 = new Soma(n1, n2);

                System.out.println("A soma de " + n1 + " + " + n2 + " = " + soma1.calculaSoma());

                scanner.close();
        }
}