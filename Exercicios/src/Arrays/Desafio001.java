package Arrays;

import java.util.Scanner;

public class Desafio001 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas notas serao calculadas?");
		int qtd = entrada.nextInt();
		double notas[]=new double[qtd],soma=0;
		System.out.println("Por favor informe as "+qtd+" notas:");
		for(int i=0;i<qtd;soma += Entrada((++i)-1));
		System.out.println("A media e: "+(soma/qtd));
	}
	static double Entrada(int indice) {
		Scanner entrada = new Scanner(System.in);
		System.out.printf("N%d: ",indice+1);
		return entrada.nextDouble(); 
	}
}