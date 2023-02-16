package controle;

import java.util.Scanner;

public class Ex001 {
	public static void main(String[] args) {
		//1. Criar um programa que receba
		//um número e verifique se ele está entre 0 e 10 e é par;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um numero");
		double number = entrada.nextDouble();
		boolean Epar = (number % 2)==0,
				zero_dez = number>=0&&number<=10;  
		String mensagen = Epar? "O numero e par":"O numero e inpar";
		mensagen += zero_dez ? " e esta entre 0 e 10" : " e nao esta entre 0 e 10"; 
		System.out.println(mensagen);
	}
}
