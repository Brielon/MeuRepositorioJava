package Lambda;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana","Bia","Lia","Gui");
		
		System.out.println("Forma tradicional...");
		for(String nome:aprovados) {
			System.out.println(nome);
		}
		System.out.println("\nLambda #1");
		aprovados.forEach(nome->System.out.println(nome+"...")); 
		System.out.println("Method Reference...");
		aprovados.forEach(System.out::println);
		System.out.println("\nLambda #2");
		aprovados.forEach(nome->MeuImprimir(nome)); 
		System.out.println("Method Reference #2...");
		aprovados.forEach(Foreach::MeuImprimir);//MeuImprimir(aprovados.get(0,1,2,etc))
		
		
	}
	static void MeuImprimir(String nome) {
		System.out.println("Oi meu nome e "+nome);
	}
}
