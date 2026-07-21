import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("=== Calculadora ===");

            System.out.println("Vamos calcular!");
            System.out.print("Digite o primeiro número: ");
            int n1 = scanner.nextInt();
            int n2;
            System.out.println("Digite um operador (+, -, *, /):");
            String operador = scanner.next().toUpperCase();

            System.out.print("Digite o segundo número: ");
            n2 = scanner.nextInt();
            while (operador.equals("/") && n2 == 0){
                    System.out.println("Não é possível dividir por zero!");
                    System.out.println("Por favor, escolha outro número: ");
                    n2 = scanner.nextInt();
            }

            Calculadora calc = new Calculadora(n1, n2);
            if (operador.equals("SOMA")   || operador.equals("+")) {
                System.out.println("A soma de " + n1 + " + " + n2 + " = " + calc.calculaSoma());
            } else if (operador.equals("SUBTRAÇAO") || operador.equals("-")) {
                 System.out.println("A subtração de "+ n1 +" - "+ n2 +" = " + calc.calculaSub());
            } else if (operador.equals("DIVISAO" )|| operador.equals("/")) {
                    System.out.println("A divisão do "+ n1 + " / "+ n2 + " = " + calc.calculaDiv());
            } else if (operador.equals("MULTIPLICAÇAO")|| operador.equals("*")) {
                    System.out.println("A multiplicação do "+ n1 + " * "+ n2 +" = " + calc.calculaMult());
            }else {
                    System.out.println("Operador inválido.");
            }

            scanner.close();
        }
}