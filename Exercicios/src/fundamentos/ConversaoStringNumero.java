package fundamentos;

import java.util.Scanner;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		Scanner javain = new Scanner(System.in);
		System.out.println("Informe o primeiro valor");
		String valor1 = javain.nextLine();
		System.out.println("Informe o segundo valor");
		
		double resposta = (Double.parseDouble(valor1)+Double.parseDouble(javain.nextLine()))/2;
		System.out.printf("A media e: %.2f",resposta);
	}
}
