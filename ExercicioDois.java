import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {

        double num1;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Aumento de 10% do Valor Total");

		System.out.println("\nInforme o número: ");
		num1 = scanner.nextDouble();

		double resultado = (num1 / 10) + num1;
		
		System.out.printf("Com o acrescimo fica: %.2f", resultado);
		

	}

}