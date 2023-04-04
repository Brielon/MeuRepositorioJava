package Arrays;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class ForEach {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double[] notas = new double[5];
	//for(double nota : notas) {
		//nota = entrada.nextDouble();//for each n pode ser usado para entrada pois aponta para uma copia e nao para o objeto
	//}
	for(int i = 0; i<notas.length;notas[(++i)-1] = entrada.nextDouble());
	for(double nota : notas) {
		System.out.println(nota); 
	}
	
	} 
	
}