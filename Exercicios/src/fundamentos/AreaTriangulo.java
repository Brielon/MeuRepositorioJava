package fundamentos;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		System.out.println("Informe a base e a altura do triangulo\nBase: ");
		Scanner entrada = new Scanner(System.in);
		double base = entrada.nextDouble();
		System.out.println("Altura: ");
		double altura = entrada.nextDouble();
		System.out.printf("A area do triangulo e: %.2f", (base*altura)/2);
		entrada.close();
	}
}
