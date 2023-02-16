package controle;

import java.util.Scanner;

public class Ex009 {
	public static void main(String[] args) {
		//9. Crie um programa que recebe 10 valores 
		//e ao final imprima o maior número.
		Scanner entra = new Scanner(System.in);
		System.out.println("Informe 10 numeros");
		double NumeroMaior = 0;
		for(int contador = 0;contador<10;contador++) {
			System.out.printf("\nN%d: ",contador+1);
			double numeros = entra.nextDouble();
			NumeroMaior = numeros > NumeroMaior ?
					numeros : NumeroMaior;
		}
		System.out.printf("\nO maior numero e o %.2f",NumeroMaior);
	}
}
