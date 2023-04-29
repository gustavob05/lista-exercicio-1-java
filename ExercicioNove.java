import java.util.Scanner; 

public class ExercicioNove { 

	public static void main(String[] args) { 

		double numUm, horas, minutos, segundo; 
		Scanner scanner = new Scanner(System.in); 

		System.out.println("Transformando um numero em horas, minutos e segundos."); 

		System.out.println("\nDigite o numero : "); 
		numUm = scanner.nextDouble(); 

        segundo = numUm * 60;
        minutos = segundo /60;
        horas= minutos /60;
        
        

		System.out.printf("\nO valor em horas é : %.2f", horas);
		System.out.printf("\nO valor em minutos é: %.2f", minutos); 
        System.out.printf("\nO valor em segundos é : %.2f", segundo); 
		scanner.close(); 

	}

}