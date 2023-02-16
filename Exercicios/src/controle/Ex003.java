package controle;

import java.util.Scanner;

public class Ex003 {
	public static void main(String[] args) {
		//3. Criar um programa que receba duas notas parciais, 
		//calcular a média final. Se a nota do aluno for maior ou igual a 
		//7.0 imprime no console "Aprovado", se a nota for menor que 7.0 e 
		//maior do que 4.0 imprime no console "Recuperação", caso contrário 
		//imprime no console "Reprovado".
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe duas notas\nNota01: ");
		double n1 = entrada.nextDouble();
		System.out.print("Nota02: ");
		double n2 = entrada.nextDouble(),
				media = (n1+n2)/2;
		boolean	aprovado = media>=7,
				recuperacao = media < 7 && media > 4;
				
		String mensagen = aprovado ? ", ele Passou" : 
			recuperacao ? ", ele esta em recuperacao" :
				", ele reprovou";
		System.out.print("O aluno tem a media "+media+mensagen);
	}
}
