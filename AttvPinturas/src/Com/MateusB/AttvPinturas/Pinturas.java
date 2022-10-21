package Com.MateusB.AttvPinturas;


public class Pinturas {

	private double lado;
	private double rendimento;
	private int tipo;
	
	public Pinturas (double lado, double rendimento, int tipo ){
		this.lado = lado;
		this.rendimento = rendimento;
		this.tipo = tipo;
	}
	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getRendimento() {
		return rendimento;
	}
	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	//classe que calcula a área total do cubo
	public String areaTotalCubo(){
		StringBuilder saida = new StringBuilder();
		
		saida.append(6*(lado*lado));
		
		return saida.toString();
	}
	
	//classe que calcula a diagonal do cubo
	public String digCubo(){
		StringBuilder saida = new StringBuilder();
		double raiz = 1.73205;

		saida.append(lado*raiz);
		
		return saida.toString();
	}
	
	//classe que calcula o volume do cubo
	public String volCubo(){
		StringBuilder saida = new StringBuilder();
		
		saida.append(lado * lado * lado);
		
		return saida.toString();
	}
	
	// classe que retornará o tipo da tinta em texto!
	public String tipoTinta(){
		StringBuilder saida = new StringBuilder();
		
		if(tipo == 1){
			saida.append(101.9);
		}else{
			if(tipo == 2){
				saida.append(212.45);
			}else{
				if(tipo == 3){
					saida.append(345.56);
				}
			}
		}
		
		return saida.toString();
	}
	
	// Classe que retornará a área do cubo
	public String areaCubo(){
		StringBuilder saida = new StringBuilder();
		
		saida.append(lado*lado);
		
		return saida.toString();
	}
	
	// Classe que calcula o rendimento
	public String areaRendimento(){
		StringBuilder saida = new StringBuilder();
		
		double area = lado * lado;
		double rendas = rendimento * area;
		saida.append(rendas);
		
		return saida.toString();
	}
	
	//classe que calcula quantos litros de tinta serão utilizados
	public String qntTinta(){
		StringBuilder saida = new StringBuilder();
		
		String areaT = areaTotalCubo();
		double areaT2 = Double.parseDouble(areaT);
		saida.append(areaT2 / rendimento);
		
		return saida.toString();
	}
	
	//classe que calcula quantas latas de tinta serão necessárias
	public String qntLatas(){
		StringBuilder saida = new StringBuilder();
		
		String qntlitros = qntTinta();
		double qntlitros1 = Double.parseDouble(qntlitros);
		saida.append(qntlitros1 / 18);
		
		return saida.toString();
	}
	
	//classe que calcula os custos
	public String precoPintura(){
		StringBuilder saida = new StringBuilder();
		
		String litroTinta = qntLatas();
		String tipoTinta = tipoTinta();
		double litros = Double.parseDouble(litroTinta);
		double tipo = Double.parseDouble(tipoTinta);
		saida.append(tipo * litros);
		
		return saida.toString();
	}
	
	public String toString() {
		
		System.out.println("A areá da base é de "+areaCubo());
		System.out.println("A areá total do cubo é de "+areaTotalCubo());
		System.out.println("O volume do cubo é de "+volCubo());
		System.out.println("A diagonal do cubo é de "+digCubo());
		System.out.println("O rendimento total é de "+areaRendimento());
		System.out.println("Serão utilizados "+qntTinta()+" litros de tintas que equivalem a "+qntLatas()+" latas");
		System.out.println("O custo total da pintura foi de "+precoPintura());
		
		return "";
	}
	
	
	
	
}
