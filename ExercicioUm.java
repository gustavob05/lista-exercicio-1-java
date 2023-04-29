import java.util.Scanner; 

public class ExercicioUm { 

	public static void main(String[] args) { 

		double numeroUm, numeroDois; 
		Scanner scanner = new Scanner(System.in); 

		System.out.println("Média Aritmética"); 

		System.out.println("\nInforme o primeiro número: "); 
		numeroUm = scanner.nextDouble(); 

		System.out.println("\nInforme o segundo número: "); 
		numeroDois = scanner.nextDouble(); 

		double mediaAritmetica = (numeroUm + numeroDois) / 2;  
		
		System.out.printf("A média aritmética dos númetos é: %.2f", mediaAritmetica); 
		scanner.close(); 

	}

}
