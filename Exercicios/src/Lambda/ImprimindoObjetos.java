package Lambda;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

//import javax.annotation.processing.SupportedSourceVersion;

public class ImprimindoObjetos {
	public static void main(String[] args) {
		List<String> aprovados =Arrays.asList("Lu","Du","Gu","Bru","GG");
		System.out.println("Usando o foreach...");
		for(String nome: aprovados)
			System.out.println(nome);
		
		System.out.println("\nUsando o Interator...");
		Iterator<String>iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nUsando Stream");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
		
		System.out.println("\nUsando so o foreach");
		aprovados.forEach(System.out::println); 
	}
}
