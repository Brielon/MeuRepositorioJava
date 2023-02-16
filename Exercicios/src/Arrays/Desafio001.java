package Arrays;

import java.util.Scanner;

public class Desafio001 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double total = 0;
		System.out.print("Informe quantas notas serao calculadas;\nQuantidade de notas: ");
		int qtd_notas = entrada.nextInt();
		double[] notas = new double[qtd_notas];
		System.out.println("Informe as notas:");
		for(int i = 0;i<notas.length;i++) {
			System.out.printf("N%d: ",i+1);
			notas[i] = entrada.nextDouble();
		} 
		for(double nota_atual : notas) {
			total += nota_atual;
		}
		System.out.println("A media e: "+total/notas.length);
	}
}
