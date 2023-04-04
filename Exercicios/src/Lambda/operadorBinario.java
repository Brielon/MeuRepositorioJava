package Lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class operadorBinario {
	public static void main(String[] args) {
		BiFunction<Double, Double, String> media1 = (n1,n2) ->
			((n1+n2)/2)>=60?
					"O aluno passou":"O aluno reprovou";
		BinaryOperator<Double> media = (n1,n2)->
			(n1+n2)/2;
		Function<Double, String> conceito = nota ->
			nota>=60?"passou":"reprovou";
		System.out.println(media1.apply(50.0, 70.0));
		System.out.println(media.andThen(conceito).apply(50.0,60.0));
	}
}
