package Com.MateusB.AttvPinturas;

public class PinturasPiramide {

	private double altura;
	private double tipo;
	private double base;
	
	public PinturasPiramide(double altura, double tipo, double base){
		this.altura = altura;
		this.base = base;
		this.tipo = tipo;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getTipo() {
		return tipo;
	}
	public void setTipo(double tipo) {
		this.tipo = tipo;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	
	// classe que calcula a area da base da piramide
	public String calculaAreaBase(){
		StringBuilder saida = new StringBuilder();
		
		saida.append((base * altura)/2 );
		
		return saida.toString();
	}
	
	// classe que calcula o volume da piramide
	public String calculaVolume(){
		StringBuilder saida = new StringBuilder();
		
		String areab = calculaAreaBase();
		double areaBase = Double.parseDouble(areab);
		saida.append((areaBase * altura)/3);
		
		return saida.toString();
	}
	
	// classe calculalateral
	public String calculaLado(){
		StringBuilder saida = new StringBuilder();
		
		double arealado = ((altura * altura)+(base * base));
		arealado = Math.sqrt(arealado);
		saida.append(arealado);
		
		return saida.toString();
	}

	// classe calculaareatotal
	public String calculaTotalArea(){
		StringBuilder saida = new StringBuilder();
		
		String lateral = calculaLado();
		String base = calculaAreaBase();
		double areaLateral = Double.parseDouble(lateral);
		double areaBase = Double.parseDouble(base);
		saida.append(areaLateral + areaBase);
		
		return saida.toString();
	}
	
	// classe que calcula quantos litros de tinta foi usado
	public String qntTinta(){
		StringBuilder saida = new StringBuilder();
		
		String areat = calculaTotalArea();
		double areaTotal = Double.parseDouble(areat);
		saida.append(areaTotal / 4.76);
		
		return saida.toString();
	}
	
	// classe das latas
	public String qntLatas(){
		StringBuilder saida = new StringBuilder();
		
		String qnttinta = qntTinta();
		double qntTintas = Double.parseDouble(qnttinta);
		saida.append(qntTintas / 18);
		
		return saida.toString();
	}
	
	//classe calcula preço
	public String precoTotal(){
		StringBuilder saida = new StringBuilder();
		
		String latas = qntLatas();
		double qntLatas = Double.parseDouble(latas);
		saida.append(qntLatas * tipo);
		
		return saida.toString();
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("A área da base da piramide é de "+calculaAreaBase()+"\n");
		builder.append("O volume da pirâmide é de "+calculaVolume()+"\n");
		builder.append("A area lateral é de "+calculaLado()+"\n");
		builder.append("Area Total é de "+calculaTotalArea()+"\n");
		builder.append("O total de tinta utilizado foi de "+qntTinta()+"que equivale a "+qntLatas()+" latas de tinta \n");
		builder.append("Preço total foi de "+precoTotal());
		
		return builder.toString();
	}

	
	
	
	
	
	
}
