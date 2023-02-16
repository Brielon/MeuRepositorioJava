package fundamentos;

import java.util.Scanner;

public class CelsiusFahrenheit {
	public static void main(String[] args) {
		//(°F - 32)x5/9=°C
		System.out.println("Informe a temperatura em graus Celcius");
		Scanner entrada = new Scanner (System.in);
		double C = entrada.nextDouble();
		System.out.printf("%.2f graus Celsius sao %.2f graus Fahrenheit", C , ((C*9)/5)+32);
		entrada.close();
	}
}
