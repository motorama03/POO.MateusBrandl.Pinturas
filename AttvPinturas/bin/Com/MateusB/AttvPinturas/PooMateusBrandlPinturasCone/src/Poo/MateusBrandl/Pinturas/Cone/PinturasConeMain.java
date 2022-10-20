package Poo.MateusBrandl.Pinturas.Cone;
import java.util.Scanner;

public class PinturasConeMain {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o raio do seu cone");
		double raio = entrada.nextDouble();
		System.out.println("Informe a altura do seu cone");
		double altura = entrada.nextDouble();
		System.out.println("Informe a geratriz de seu cubo");
		double geratriz = entrada.nextDouble();
		
		double tipo = 0;
		do {
			System.out.println("Qual tipo de tinta você deseja?");
			System.out.println("1- tinta de 238,9R$, 2- 467,98R$ ou 3- 758,34R$");
			tipo = entrada.nextDouble();
		}while(tipo != 1 && tipo != 2 && tipo != 3);
		
		PinturasCone tinta = new PinturasCone(raio, altura, geratriz, tipo);
		
		System.out.println(tinta.toString());
		
			
		entrada.close();
	}

}
