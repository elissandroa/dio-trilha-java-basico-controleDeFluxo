package controleFluxo;

import java.util.Scanner;
//Controle de fluxo com tratamento de exceções
public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
		int parametroUm = terminal.nextInt();
		int parametroDois = terminal.nextInt();
		
		contar(parametroUm, parametroDois);
		terminal.close();
	}
	
	static void contar(int parametroUm, int parametroDois) {
		if (parametroUm < parametroDois) {
			int totalInteracoes = parametroDois - parametroUm;
			for(int i = 1; i <= totalInteracoes; i++) {
				System.out.println("Imprimeinto o número: "+ i);
			} 
		} else {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
	}
}