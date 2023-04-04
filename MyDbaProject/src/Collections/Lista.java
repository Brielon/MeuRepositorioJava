package Collections;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		//aceita repeticao 
		List<String> aprovados = new  ArrayList<>();
		aprovados.add("Diogo");
		aprovados.add("Henrrique");
		aprovados.add("Percival");
		aprovados.add("Pericles");
		aprovados.add("Raimundo");
		aprovados.add("Angelo");
		for(String nome:aprovados) {
			System.out.println(nome+" foi aprovado");
		}
		//aqui tem indice
		aprovados.get(1);
		System.out.println(aprovados.get(1));
		
		
		ApresentaStrg(aprovados.stream());
		ApresentaStrg("Abraao ","Percival","pericles","teteu");
	}

	private static void ApresentaStrg(String... string) {
		for(String strig:string) {
			System.out.print(strig+",");
		}
		System.out.println("\nEstao contidos aqui");
		
	}
	private static void ApresentaStrg(@SuppressWarnings("rawtypes") List teste) {
		String[] minhaarray = new String[teste.size()];
		int i =0;

		for(Object strig:teste) {
			minhaarray[i++]=(String)strig;
	}
		ApresentaStrg(minhaarray);
	}
	
}
