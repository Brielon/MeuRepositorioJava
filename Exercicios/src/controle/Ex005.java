package controle;

import java.util.Scanner;

public class Ex005 {
	public static void main(String[] args) {
		//5. Refatorar o exercício 04, utilizando a estrutura switch.
		Scanner entra = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		double numero_entrado = entra.nextDouble(),
				numero = numero_entrado;
		boolean primo = true;
		
		for(int contador = 0;numero>=0;numero--) {
			contador += numero_entrado%numero == 0 ? 1 : 0 ;
			if (contador>2) {
				primo = false;
				break;
			}
		}
		String primo_number = primo ? "1" : "0";
		switch (primo_number){
			case "1":
				System.out.println("O numero e primo");
				break;
			case "0":
				System.out.println("o numero nao e primo");
				break;
		}
		//System.out.println( primo ? "O numero e primo" : "o numero nao e primo");
	}
}
