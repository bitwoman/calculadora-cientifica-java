package calculadoracientifica;

import java.text.DecimalFormat;

public class Calculadora {
/*
 * ATRIBUTOS
 */
	private int numero1, numero2;
	private double numeroCientifico, numeroCientifico2;
	
/*
 * 4 métodos para cálculos aritméticos simples.
 */
	private int soma, subtracao, multiplicacao;
	private float divisao;
	
/*
 * 6 métodos de cálculo científica, usando a biblioteca Math. 
 */
	private double seno, coseno, tangente, raizQuadrada, logaritmo;
	private int potenciacao;
	
	
/*
 * CONSTRUTOR
 */
	public Calculadora() {
		this.soma = 0;
		this.subtracao = 0;
		this.multiplicacao = 0;
		this.divisao = 0;
	}
	
	
/*
 * MÉTODOS PERSONALIZADOS
 */
/*
 * Existe um método para limpar a calculadora.
 */
	public void limparTela() {
		for(int i=0; i<30; i++){
			System.out.println("\n");
		}
	}
	
/*
 * ================== SOMAR ===================
 */
	public void somar(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
		
		soma = numero1 + numero2;
		
		this.setSoma(soma);
		
		System.out.println("\n" + numero1 + " + " + numero2 + " = " + this.getSoma());
	}
	
	
/*
 * ================== SUBTRAIR ==================
 */
	public void subtrair(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
			
		subtracao = numero1 - numero2;
					
		this.setSubtracao(subtracao);
					
		System.out.println("\n" + numero1 + " - " + numero2 + " = " + this.getSubtracao());
	}
		
	
/*
 * ================== MULTIPLICAR ==================
 */
	public void multiplicar(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
			
		multiplicacao = numero1 * numero2;
					
		this.setMultiplicacao(multiplicacao);
						
		System.out.println("\n" + numero1 + " x " + numero2 + " = " + this.getMultiplicacao());
	}
	
	
/*
 * ================== DIVIDIR ==================
 */
	public void dividir(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
				
		divisao = numero1/numero2;
						
		this.setDivisao(divisao);
							
		System.out.println("\n" + numero1 + " / " + numero2 + " = " + this.getDivisao());
	}
	
	
/*
 * 	================== SENO ==================
 */
	public void calcularSeno() {
		seno = Math.sin(this.getNumeroCientifico());
		this.setSeno(seno);
		
		DecimalFormat df = new DecimalFormat("0.##");
		String senoFormat = df.format(this.getSeno());
		
		System.out.println("\nSeno(" + this.getNumeroCientifico() + ") " + " = " + senoFormat);
	}
	

/*
 * 	================== COSENO ==================
 */
	public void calcularCoseno() {
		coseno = Math.cos(this.getNumeroCientifico());
		this.setCoseno(coseno);
			
		DecimalFormat df = new DecimalFormat("0.##");
		String cosenoFormat = df.format(this.getCoseno());
			
		System.out.println("\nCoseno(" + this.getNumeroCientifico() + ") " + " = " + cosenoFormat);
	}
	

/*
 * ================== TANGENTE ==================
 */
	public void calcularTangente() {
		tangente = Math.tan(this.getNumeroCientifico());
		this.setTangente(tangente);
						
		DecimalFormat df = new DecimalFormat("0.##");
		String tangenteFormat = df.format(this.getTangente());
						
		System.out.println("\nTangente(" + this.getNumeroCientifico() + ") " + " = " + tangenteFormat);
	}
	
/*
 * =============== RAIZ QUADRADA ================
 */
	public void calcularRaizQuadrada() {
		raizQuadrada = Math.sqrt(this.getNumeroCientifico());
		this.setRaizQuadrada(raizQuadrada);
		
		System.out.println("\nsqrt(" + this.getNumeroCientifico() + ")" + " = " + this.getRaizQuadrada());
	}


/*
 * ================= LOGARITMO ===================
 */
	public void calcularLogaritmo(double numero, double base) {
		this.numeroCientifico = numero;
		this.numeroCientifico2 = base;
		
		this.setNumeroCientifico(numero);
		this.setNumeroCientifico2(base);
		
		double logNumero = Math.log(this.getNumeroCientifico());
		double logBase = Math.log(this.getNumeroCientifico2());
		
		logaritmo = (logNumero/logBase);
		this.setLogaritmo(logaritmo);
		
		DecimalFormat df = new DecimalFormat("0.##");
		String logFormat = df.format(this.getLogaritmo());
						
		System.out.println("\nlog(" + this.getNumeroCientifico2() + ") " + " = " + logFormat);
	}
	
	
/*
 * ================ POTENCIAÇÃO =================
 */
	public void calcularPotenciacao(double numero, double numeroPotencia) {
		this.numeroCientifico = numero;
		this.numeroCientifico2 = numeroPotencia;
		
		this.setNumeroCientifico(numero);
		this.setNumeroCientifico2(numeroPotencia);
		
		potenciacao = (int) Math.pow(numero, numeroPotencia);
		
		this.setPotenciacao(potenciacao);
		
		System.out.println("\npow(" + this.getNumeroCientifico() + ") " + " = " + this.getPotenciacao());
	}
	
	
/*
 * GETTERS AND SETTERS
 */	
/*
 * Métodos aritméticos simples
 */
	public int getNumero1() {
		return numero1;
	}

	public double getNumeroCientifico2() {
		return numeroCientifico2;
	}

	public void setNumeroCientifico2(double numeroCientifico2) {
		this.numeroCientifico2 = numeroCientifico2;
	}

	public double getNumeroCientifico() {
		return numeroCientifico;
	}

	public void setNumeroCientifico(double numeroCientifico) {
		this.numeroCientifico = numeroCientifico;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	
	public int getSoma() {
		return soma;
	}
	
	public void setSoma(int soma) {
		this.soma = soma;
	}
	
	public int getSubtracao() {
		return subtracao;
	}
	
	public void setSubtracao(int subtracao) {
		this.subtracao = subtracao;
	}
	
	public int getMultiplicacao() {
		return multiplicacao;
	}
	
	public void setMultiplicacao(int multiplicacao) {
		this.multiplicacao = multiplicacao;
	}
	
	public float getDivisao() {
		return divisao;
	}
	
	public void setDivisao(float divisao) {
		this.divisao = divisao;
	}

/*
 * Métodos científicos
 */
	public double getSeno() {
		return seno;
	}

	public void setSeno(double seno) {
		this.seno = seno;
	}

	public double getCoseno() {
		return coseno;
	}

	public void setCoseno(double coseno) {
		this.coseno = coseno;
	}

	public double getTangente() {
		return tangente;
	}

	public void setTangente(double tangente) {
		this.tangente = tangente;
	}

	public double getRaizQuadrada() {
		return raizQuadrada;
	}

	public void setRaizQuadrada(double raizQuadrada) {
		this.raizQuadrada = raizQuadrada;
	}

	public double getLogaritmo() {
		return logaritmo;
	}

	public void setLogaritmo(double logaritmo) {
		this.logaritmo = logaritmo;
	}

	public int getPotenciacao() {
		return potenciacao;
	}

	public void setPotenciacao(int potenciacao) {
		this.potenciacao = potenciacao;
	}
}