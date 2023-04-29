import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		double num1, base,logra; 

		Scanner scanner = new Scanner(System.in);

		System.out.println("Calculo de Logaritmo");

		System.out.println("Informe o numero: ");
		 num1 = scanner.nextDouble();

        System.out.println("Informe a base: ");
		 base = scanner.nextDouble();
  
	    logra = (Math.log(num1)) / (Math.log(base));

		System.out.printf("O valor do logaritmo: %.2f", logra);
		scanner.close();

	}
}