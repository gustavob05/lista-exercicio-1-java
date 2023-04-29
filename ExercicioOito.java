import java.util.Scanner; 
public class ExercicioOito{

  public static void main(String[] args){
    double vei, rodas, carro, moto;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Calculo da quantidadede Carros e Moto do Estacionamento");
    System.out.println("\nInforme o número de veículos:");
    vei = scanner.nextDouble();
    
    System.out.println("\nInforme o numero de rodas:");
    rodas = scanner.nextDouble();

    carro = ((vei + (-vei) + (-vei)) + rodas /2);
    moto = (vei - carro);


    System.out.printf("\nTotal de motos: %.2f", moto);
    System.out.printf("\nTotal de carros: %.2f", carro);
    scanner.close();

    }

}    