package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
//pega um dia e retorna um numero domingo -> 1 ... sabado -> 7
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um dia da semana: ");
		String dia = entrada.nextLine().toLowerCase();
		if(dia.contains("domingo"))
			System.out.println(1);
		else if(dia.contains("segunda"))
			System.out.println(2);
		else if(dia.contains("terça"))
			System.out.println(3);
		else if(dia.contains("quarta"))
			System.out.println(4);
		else if(dia.contains("quinta"))
			System.out.println(5);
		else if(dia.contains("sexta"))
			System.out.println(6);
		else if(dia.contains("sabado"))
			System.out.println(7);
		else 
			System.out.println("Dia nao configurado");
		entrada.close();
	}
}
