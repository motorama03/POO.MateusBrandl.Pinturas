package Com.MateusB.AttvPinturas;
import java.util.Scanner;

public class PinturasPiramideMain {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double tipo = 0;
		do {
			System.out.println("Qual tipo de tinta você deseja?");
			System.out.println("1- tinta de 127.90R$, 2- 258,98R$ ou 3- 334,34R$");
			tipo = entrada.nextDouble();
		}while(tipo != 1 && tipo != 2 && tipo != 3);
		if(tipo == 1){
			tipo = 127.89;
		}if(tipo == 2){
			tipo = 258.98;
		}if(tipo == 3){
			tipo = 334.34;
		}
		
		System.out.println("Informe a base de sua pirâmide");
		double base = entrada.nextDouble();
		
		System.out.println("Informe a altura de sua pirâmide");
		double altura = entrada.nextDouble();
		
		PinturasPiramide pintas = new PinturasPiramide(altura, tipo, base);
		
		System.out.println(pintas.toString());
		
		entrada.close();
	}

}
