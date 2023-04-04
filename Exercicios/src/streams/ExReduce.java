package streams;

import java.util.Arrays;
import java.util.List;
//import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class ExReduce {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
		BinaryOperator<Integer> soma = (acumulador,nums) -> 
		acumulador+nums;
		numeros.stream()
				.filter(a -> a >= 4 )
				.reduce(soma)
			//.map(a -> a+", e a resposta")
				//.forEach(System.out::println);
				.ifPresent(System.out::println);
	}
}
