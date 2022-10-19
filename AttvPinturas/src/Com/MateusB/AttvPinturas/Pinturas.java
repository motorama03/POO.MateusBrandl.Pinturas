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
	
	// classe que retornará o tipo da tinta em texto!
	public String tipoTinta(){
		StringBuilder saida = new StringBuilder();
		
		if(tipo == 1){
			saida.append("tinta milanesa");
		}else{
			if(tipo == 2){
				saida.append("tinta a la-carmesin");
			}else{
				if(tipo == 3){
					saida.append("tinta belinda");
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
	
	public String toString() {
		return "Pinturas [lado=" + lado + ", rendimento=" + rendimento
				+ ", tipo=" + tipo + "]";
	}
	
	
	
	
}
