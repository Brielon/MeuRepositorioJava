package fundamentos;

import java.util.Scanner;

public class FahrenheitCelsius {
	public static void main(String[] args) {
		//(°F - 32)x5/9=°C
		System.out.println("Informe a temperatura em Fahrenheit");
		Scanner entrada = new Scanner(System.in);
		double  F = entrada.nextDouble();
		System.out.printf("%.2f graus Fahrenheit sao %.2f graus Celsius",F , (F-32)*5.0/9);
		entrada.close();
	}
}
