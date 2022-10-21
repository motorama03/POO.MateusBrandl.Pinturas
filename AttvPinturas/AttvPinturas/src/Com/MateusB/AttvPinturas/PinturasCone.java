package Com.MateusB.AttvPinturas;

public class PinturasCone {

	private final double PI = 3.14;
	private final double rendimento = 3.45;
	private double raio;
	private double altura;
	private double geratriz;
	private double tipo;
	
	public PinturasCone(double raio, double altura, double geratriz, double tipo) {
	
		this.raio = raio;
		this.altura = altura;
		this.geratriz = geratriz;
		this.tipo = tipo;
		
	}
	
	public double getRendimento() {
		return rendimento;
	}
	public double getGeratriz() {
		return geratriz;
	}
	public void setGeratriz(double geratriz) {
		this.geratriz = geratriz;
	}
	public double getTipo() {
		return tipo;
	}
	public void setTipo(double tipo) {
		if(tipo == 1 && tipo == 2 && tipo == 3) {
			this.tipo = tipo;
		}
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPI() {
		return PI;
	}
	
	// classe que calcula a area total
	public String areaTotal() {
		StringBuilder saida = new StringBuilder();
		
		double area = ((PI * raio)*(raio + geratriz));
		saida.append(area);
		
		return saida.toString();
	}
	
	//classe que calcula a area do fundo do cone
	public String areaFundo() {
		StringBuilder saida = new StringBuilder();
		
		double area = PI*(raio*raio);
		saida.append(area);
		
		return saida.toString();
	}
	
	// clase que calcula a area lateral do cone
	public String areaLateral() {
		StringBuilder saida = new StringBuilder();
		
		String areaF = areaFundo();
		double areaFundo = Double.parseDouble(areaF);
		String areaT = areaTotal();
		double areaTotal = Double.parseDouble(areaT);
		saida.append(areaTotal - areaFundo);
		
		return saida.toString();
	}
	
	//classe que calcula quantos litros de tinta sera utilizado
	public String totalLitrosTinta() {
		StringBuilder saida = new StringBuilder();
		
		String areat = areaTotal();
		double areaTotal = Double.parseDouble(areat);
		double qntT = areaTotal * rendimento;
		saida.append(qntT);
		
		return saida.toString();
	}
	
	//classe total latas
	public String totalLatasTinta(){
		StringBuilder saida = new StringBuilder();
		
		String tLitros = totalLitrosTinta();
		double totalLitros = Double.parseDouble(tLitros);
		saida.append(totalLitros / 18);
		
		return saida.toString();
	}
	
	
	//classe total preco
	public String totalPreco(){
		StringBuilder saida = new StringBuilder();
		if(tipo == 1){
			tipo = (238.9);
		}else{
			if(tipo == 2){
				tipo = (467.98);
			}else{
				if(tipo == 3){
					tipo = (758.34);
				}
			}
		}
		String qLitros = totalLatasTinta();
		double totalLatas = Double.parseDouble(qLitros);
		
		saida.append(tipo * totalLatas);
		
		return saida.toString();
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("O raio do cone é de "+raio+", a altura é de "+altura+" e a geratriz é de "+geratriz+"\n");
		builder.append("A área total do cone é de "+areaTotal()+"\n");
		builder.append("A área do fundo do cone é de "+areaFundo()+"\n");
		builder.append("A área da lateral é de "+areaLateral()+"\n");
		builder.append("A quantidade de tinta total usada foi "+totalLitrosTinta()+"litros \n");
		builder.append("Serão utilizadas "+totalLatasTinta()+" latas de tinta");
		builder.append("O custo final será de "+totalPreco());
		return builder.toString();
	}
	
	
	
}
