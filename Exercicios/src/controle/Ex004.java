package controle;

import java.util.Scanner;

public class Ex004 {
	public static void main(String[] args) {
		//4. Criar um programa que receba 
		//um número e diga se ele é um número primo.
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
		System.out.println( primo ? "O numero e primo" : "o numero nao e primo");
	}
}
