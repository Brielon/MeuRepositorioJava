package controle;

import java.util.Scanner;

public class Ex002 {
	public static void main(String[] args) {
		//2. Criar um programa informa se o ano atual é um ano bissexto;
		//anos bissestos sao multiplos de 4
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o ano: ");
		int ano = entrada.nextInt();
		boolean bissexto = ano%4 == 0; 
		String mensagen = bissexto ?
				" e bissexto" : " nao e bissexto" ;
		System.out.println("O ano "+ano+mensagen);
	}
}
