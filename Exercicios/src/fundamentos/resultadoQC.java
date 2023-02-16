package fundamentos;

import java.util.Scanner;

public class resultadoQC {
	public static void main(String[] args) {
		System.out.println("Informe um numero");
		Scanner entrada = new Scanner(System.in);
		double numero = entrada.nextDouble();
		System.out.printf("%.2f ao quadrado e %.2f é ao cubo e %.2f",numero,Math.pow(numero,2),Math.pow(numero,3));
	}
}
