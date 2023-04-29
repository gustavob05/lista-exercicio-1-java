import java.util.Scanner; 

public class ExercicioDez { 

	public static void main(String[] args) { 

		double numUm, numDois, numTres, medArt, medHar, Cubi, medGeo; 
		Scanner scanner = new Scanner(System.in); 

		System.out.println("Calculo de Tres valor em Média aritmética, Média harmônica e Média geométrica."); 

		System.out.println("\nDigite o numero : "); 
		numUm = scanner.nextDouble(); 
        System.out.println("\nDigite o numero : "); 
		numDois = scanner.nextDouble(); 
        System.out.println("\nDigite o numero : "); 
		numTres = scanner.nextDouble(); 

        medArt = (numUm + numDois + numTres) / 3;
        medHar = (1/numUm) + (1/numDois) + (1/numTres) / 3;
        Cubi = numUm * numDois * numTres;
        medGeo = Math.cbrt(Cubi);
        
    
		System.out.printf("\nA media aritmética é : %.2f", medArt);
		System.out.printf("\nA media harmônica é: %.2f", medHar); 
        System.out.printf("\nA media geométrica é : %.2f", medGeo); 
		scanner.close(); 

	}

}