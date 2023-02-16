package fundamentos;

import java.util.Scanner;

public class DesafioMediaSalario {
	public static void main(String[] args) {
		Scanner javain = new Scanner(System.in);
		//informar 3 salarios com a flexibilidade de ter . ou ,
		//System.out.println("teste,teste".replace(',', '.'));
		System.out.println("Informe os salarios dos ultimos 3 meses\nPrimeiro mes: ");
		double primeiro_mes = Double.parseDouble(javain.nextLine().replace(',', '.'));
		System.out.println("\nSegundo mes: ");
		double segundo_mes = Double.parseDouble(javain.nextLine().replace(',', '.'));
		System.out.println("\nTerceiro mes: ");
		double terceiro_mes = Double.parseDouble(javain.nextLine().replace(',', '.'));
		double media = (primeiro_mes*segundo_mes*terceiro_mes)/3;
		System.out.printf("A media do salario do trabalhador e %.2f", media);
		javain.close();
	}
}
