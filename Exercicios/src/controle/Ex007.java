package controle;

import java.util.Scanner;

public class Ex007 {
	public static void main(String[] args) {
		//7. Criar um programa que enquanto estiver recebendo números 
		//positivos, imprime no console a soma dos números inseridos, 
		//caso receba um número negativo, encerre o programa. Tente utilizar 
		//a estrutura do while.
		double numero=0,soma=0;
				Scanner entra = new Scanner(System.in);
				System.out.println("Informe numeros");
		do {
			numero = entra.nextDouble();
			soma += numero > 0 ? numero : 0;
		}while(numero>0);
		System.out.println(soma);
	}
}
