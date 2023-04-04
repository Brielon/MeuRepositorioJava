package Arrays;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double total = 0;
		System.out.print("Informe quantas notas serao calculadas: ");
		int qtd_notas = entrada.nextInt();
		System.out.print("Informe quantos alunos ha na turma: ");
		int qtd_alunos = entrada.nextInt();
		
		double[][] notas = new double[qtd_alunos][qtd_notas];
		
		
		
		for(int aluno = 0;aluno<notas.length;aluno++) {
			for (int nota = 0;nota<notas[aluno].length;nota++) {
				System.out.println("Nota "+(nota+1)+" do aluno "+(aluno+1)+":");
				notas[aluno][nota] = entrada.nextDouble(); 
			}
		}
		for(int aluno = 0 ; aluno < notas.length;aluno++) {
			System.out.println("O aluno "+(1+aluno)
					+" tem a media: "+media(notas[aluno]));
			total += media(notas[aluno]);
			
		}
		System.out.println("A media da turma e: "+(total/notas.length));
		
		
		
	}
	static double media(double[] Arrey) {
		double total = 0;
		for(double ArreyAtual : Arrey) {
			total += ArreyAtual; 
		} 
		return total/Arrey.length;
}
}
