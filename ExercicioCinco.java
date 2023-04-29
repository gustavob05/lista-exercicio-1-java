import java.util.Scanner; 

public class ExercicioCinco { 

	public static void main(String[] args) { 

		double horas, valorph, salafa,  filho, slfinal; 
		Scanner scanner = new Scanner(System.in); 

		System.out.println("Calculo do Salario."); 

		System.out.println("\nDigite as horas trabalhas por mes: "); 
		horas = scanner.nextDouble(); 

        System.out.println("\nDigite a quantidade de filho menor de 14 anos: "); 
		filho = scanner.nextDouble(); 

		salafa = filho * 56.47;
        valorph = horas * 8.13;
        slfinal = salafa + valorph;
		
		System.out.printf("\nO salario do funcionario é: %.2f", slfinal); 
        System.out.printf("\nO salario familia é: %.2f", salafa); 
		scanner.close(); 

	}

}