package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {
		Consumer<String> print = System.out::println;
		Consumer<Integer> println = System.out::println;
		
		Stream<String> langs = Stream.of("Java","Lua","js\n");
		langs.forEach(print); 
		
		String[] MaisLangs = {"Pyton","Lisp","perl","GO\n"};
		
		Stream.of(MaisLangs).forEach(print);
		Arrays.stream(MaisLangs).forEach(print);
		Arrays.stream(MaisLangs,1,2).forEach(print);
		
		 List<String> outrasLangs = Arrays.asList("C","PHP","Kotlin\n");
		 outrasLangs.stream().forEach(print);
		 outrasLangs.parallelStream().forEach(print);
		 
		// Stream.iterate(0,n->n+1).forEach(println);
	}
}
