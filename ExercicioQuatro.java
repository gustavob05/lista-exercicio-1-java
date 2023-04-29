import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		double capital, apl, jurs,mont;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Calculo de Juros Composto");

		System.out.println("Informe o Capital: ");
		 capital = scanner.nextDouble();

        System.out.println("Qual prazo de aplicação em meses? ");
		 apl = scanner.nextDouble();

        System.out.println("Informe a taxa de juros mensal: ");
		 jurs = scanner.nextDouble();
        
         mont = Math.pow(1 + jurs, apl) * capital; 
	
		System.out.printf("O valor da montante é: %.2f", mont);
		scanner.close();

	}

}
