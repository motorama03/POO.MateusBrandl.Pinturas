package Com.MateusB.AttvPinturas;
import java.util.Scanner;

public class PinturasCuboMain {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual tipo de tinta você deseja usar?");
		int tinta = 0;
		
		do{
			System.out.println("1- tinta milanesa R$ 101,9, 2- tinta a la-carmesin R$ 212,45 ou 3- tinta belinda R$345,56");
			tinta = entrada.nextInt();
		}
		while(tinta != 1 && tinta != 2 && tinta != 3);
		
		
		
		System.out.println("Cite o tamanho de um dos lados do cubo no qual você deseja pintar!");
		double lado = entrada.nextDouble();
		
		System.out.println("Informe quantos litros por metros quadrados você deseja gastar!");
		double rendimento = entrada.nextDouble();
		
		Pinturas ObjPintura = new Pinturas(lado, rendimento, tinta);
		
		System.out.println("A área do cubo é de "+ObjPintura.areaCubo());
		System.out.println("O rendimento total é de "+ObjPintura.areaRendimento());
		System.out.println("O tipo de tinta escolhido foi de "+ObjPintura.tipoTinta());
		System.out.println("Obrigado!");
		
		entrada.close();
			
	}

}
