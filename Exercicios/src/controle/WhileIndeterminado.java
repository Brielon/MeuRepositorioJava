package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		System.out.println("Escreva: ");
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		String atual = "";
		while (!(atual.contains("sair"))) {//aquii fica melhor o while
			atual = entrada.nextLine();
			texto += texto.equals("")? "":" ";
			texto += atual.toLowerCase().equals("sair")?"":atual;
			atual = atual.toLowerCase();
		}
		System.out.println(texto); 
	}
}
