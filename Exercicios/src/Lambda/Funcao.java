package Lambda;

import java.util.function.Consumer;
import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		//vai receber um inteiro e retornar uma string
		Function<Integer, String> ImparPar = num -> 
			num%2==0?" e par":" e impar";
			
		Function<String, String> concatenar = resultado ->
			"O resultado"+resultado;
		Function<String, String> Impolgado = Impolgacao ->
			Impolgacao+"!!!";
		//int ImparPar(32)retornou "e par"
			String teste = ImparPar.
		//andThen ou seja use tambem concatenar("e par") retornou "O resultaddo e par"
					andThen(concatenar).
		//andThen Impolgado("O resultaddo e par") retornou "O resultaddo e par!!!"
					andThen(Impolgado).apply(32);
		Consumer<String> mostrar = string -> System.out.println(string);
		mostrar.accept(teste);
	}
}
