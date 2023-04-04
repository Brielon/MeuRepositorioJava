package Lambda;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	public static void main(String[] args) {
		UnaryOperator<Integer> MaisDois = n -> n+2;
		UnaryOperator<Integer> VesesDois = n -> n*2;
	UnaryOperator<Integer> AoQuadrado = n -> n*n;// |
		int resultado = MaisDois//faz as funcoes de v nesse sentido 0 -> maisdois ->vezesdois -> aoquadrado;
				.andThen(VesesDois)
				.andThen(AoQuadrado)
				.apply(0);
		System.out.println(resultado);	
		int resultado2 = AoQuadrado
				.compose(VesesDois)
				.compose(MaisDois)
				.apply(0);//faz as funcoes de ^ nesse sentido 0 -> maisdois ->vezesdois -> aoquadrado;
	//										  |	
		System.out.println(resultado2);
	}
}
