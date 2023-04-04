package Lambda;

import java.util.function.Predicate;

public class PredicadoComposicao {
	public static void main(String[] args) {
		Predicate<Integer> isPar = num -> num%2==0?true:false;//redundate pois num%2==0 por si so ja RETORNA BOOLEAN
		Predicate<Integer> isTreeNumbers = num -> num>=100&&num<=999;
		System.out.println(isPar.and(isTreeNumbers).test(3));
		System.out.println(isPar.and(isTreeNumbers).negate().test(3));
		System.out.println(isPar.or(isTreeNumbers).test(3));
		
		
	}
}
