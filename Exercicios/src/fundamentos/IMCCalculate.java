package fundamentos;

import java.util.Scanner;

public class IMCCalculate {
	public static void main(String[] args) {
		//IMC = peso / altura 
		System.out.print("Informe o seu peso e sual altura\nPeso: ");
		Scanner entrada = new Scanner(System.in);
		double peso = entrada.nextDouble();
		System.out.print("Altura(em centimetros): ");
		double altura = entrada.nextDouble()/100;
		System.out.printf("O seu IMC e de: %.2f", peso/altura);
	}
}
