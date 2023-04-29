import java.util.Scanner; 

public class ExercicioSete { 

	public static void main(String[] args) { 

		double salario, comissao, comissaorece, slfinal; 
		Scanner scanner = new Scanner(System.in); 

		System.out.println("Calculo Salario com Comissão."); 

		System.out.println("\nDigite o salario fixo do vendedor : "); 
		salario = scanner.nextDouble(); 

        System.out.println("\nDigite o valor total das vendas: "); 
		comissao = scanner.nextDouble(); 

		comissaorece = comissao * 0.4;
        slfinal = salario +  comissaorece;
       
		
		System.out.printf("\nO salario do funcionario é: %.2f", slfinal); 
        System.out.printf("\nO valor da comissão é : %.2f", comissaorece); 
		scanner.close(); 

	}

}