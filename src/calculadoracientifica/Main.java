package calculadoracientifica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);		
		Calculadora calculadora = new Calculadora();
		
		int n1, n2;
		double nm1, nm2;
		
		System.out.println("Qual operação desejar realizar?\n"
							+ "[0] Limpar tela;\n"
							+ "[1] Somar;\n"
							+ "[2] Subtrair;\n"
							+ "[3] Multiplicar;\n"
							+ "[4] Dividir;\n"
							+ "[5] Seno;\n"
							+ "[6] Coseno;\n"
							+ "[7] Tangente;\n"
							+ "[8] Raiz Quadrada;\n"
							+ "[9] Logaritmo;\n"
							+ "[10] Potenciação.\n");
		
		int operacao = enter.nextInt();
		
		switch(operacao) {
			case 0:
				calculadora.limparTela();
				break;
			case 1:
				System.out.println("Digite o primeiro número: ");
				n1 = enter.nextInt();
				
				System.out.println("Digite o segundo número: ");
				n2 = enter.nextInt();
				
				calculadora.somar(n1, n2);
				
				break;
			case 2:
				System.out.println("Digite o primeiro número: ");
				n1 = enter.nextInt();
				
				System.out.println("Digite o segundo número: ");
				n2 = enter.nextInt();
				
				calculadora.subtrair(n1, n2);
				
				break;
			case 3:
				System.out.println("Digite o primeiro número: ");
				n1 = enter.nextInt();
				
				System.out.println("Digite o segundo número: ");
				n2 = enter.nextInt();
				
				calculadora.multiplicar(n1, n2);
				
				break;
			case 4:
				System.out.println("Digite o primeiro número: ");
				n1 = enter.nextInt();
				
				System.out.println("Digite o segundo número: ");
				n2 = enter.nextInt();
				
				calculadora.dividir(n1, n2);
				
				break;
			case 5:
				System.out.println("Digite o número: ");
				nm1 = enter.nextDouble();
				
				calculadora.setNumeroCientifico(nm1);
				calculadora.calcularSeno();
				
				break;
			case 6:
				System.out.println("Digite o número: ");
				nm1 = enter.nextDouble();
				
				calculadora.setNumeroCientifico(nm1);
				calculadora.calcularCoseno();
				
				break;
			case 7:
				System.out.println("Digite o número: ");
				nm1 = enter.nextDouble();
				
				calculadora.setNumeroCientifico(nm1);
				calculadora.calcularTangente();
				
				break;
			case 8:
				System.out.println("Digite o número: ");
				nm1 = enter.nextDouble();
				
				calculadora.setNumeroCientifico(nm1);
				calculadora.calcularRaizQuadrada();
				
				break;
			case 9:
				System.out.println("Digite o número: ");
				nm1 = enter.nextDouble();
				
				System.out.println("Digite o número base: ");
				nm2 = enter.nextDouble();
				
				calculadora.calcularLogaritmo(nm1, nm2);
				
				break;
			case 10:
				System.out.println("Digite o número: ");
				nm1 = enter.nextDouble();
				
				System.out.println("Digite o número a ser elevado: ");
				nm2 = enter.nextDouble();
				
				calculadora.calcularPotenciacao(nm1, nm2);
				
				break;				
		}
	}
}