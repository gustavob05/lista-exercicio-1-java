import java.util.Scanner; 

public class ExercicioTres { 

	public static void main(String[] args) { 

		double grausFahrenheit, convers; 
		Scanner scanner = new Scanner(System.in); 

		System.out.println("Conversão de Fahrenheit para graus Centígrados."); 

		System.out.println("\nInforme os graus em Fahrenheit: "); 
		grausFahrenheit = scanner.nextDouble(); 

		convers =  (grausFahrenheit - 32) / 1.8;  
		
		System.out.printf("Em graus Centígrados fica: %.2f", convers); 
		scanner.close(); 

	}

}
