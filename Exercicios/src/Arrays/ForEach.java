package Arrays;

import javax.annotation.processing.SupportedSourceVersion;

public class ForEach {
	public static void main(String[] args) {
		double[] notas = {6,6,9,8,52,4,4};
		for(double nota_atual : notas) {
			System.out.println(nota_atual);
		}
	}
}
