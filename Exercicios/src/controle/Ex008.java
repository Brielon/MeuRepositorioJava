package controle;

import java.util.Scanner;

public class Ex008 {
	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in);
		System.out.println("Informe uma palavra");
		String palavra = entra.next();
		for(int i = 0;i<=palavra.length();i++) {
		System.out.println(palavra.charAt(i));
		}
	}
}
