package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		//set com generics passa a se comportar
		Set<String> aprovados = new TreeSet<>();//LinkedHashSet respeita a ordem de inserçao
		//TreeSet respeita a ordem alfabetica
		aprovados.add("Diogo");
		aprovados.add("Henrrique");
		aprovados.add("Percival");
		aprovados.add("Pericles");
		aprovados.add("Raimundo");
		aprovados.add("Angelo");
		
		for(String nome: aprovados) {
			System.out.println(nome+" foi aprovado");
		}
	}
}
