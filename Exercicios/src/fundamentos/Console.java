package fundamentos;

import java.util.Scanner;

import javax.print.attribute.SetOfIntegerSyntax;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");

		System.out.printf("Megasena: %d %d %d %d %d",1,2,3,4,5);
		System.out.printf("Salario: R$ %.2f",5_234.23);
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nDigite o seu nome\n");
		String nome = entrada.nextLine();
		System.out.println("\nDigite o seu sobrenome\n");
		String sobrenome = entrada.nextLine();
		System.out.println("\nDigite a sua idade\n");
		int idade = entrada.nextInt();
		entrada.nextLine();//uma boa pratica e sempre limpar o buffer do teclado ex
		String texto = String.format("Olá %s %s, você tem %d anos e é muito bem vindo ao meu primeiro programa",
				nome,sobrenome,idade);
		
		
		System.out.printf(texto);
		
		
		 
		
		
	}
}
