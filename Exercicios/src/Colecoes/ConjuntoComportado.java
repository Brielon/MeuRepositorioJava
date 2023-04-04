package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		Set<String> lista = new HashSet<String>();//desordenado
		lista.add("Angelo");
		lista.add("Gabriel");
		lista.add("Beto");
		lista.add("Boareto");
		lista.add("Ernando");
		lista.add("Carlos");
		for(String nome:lista) {
			System.out.println(nome);
		}
		Set<Integer> numeros = new TreeSet<Integer>();//ordenado
		numeros.add(1);
		numeros.add(166);
		numeros.add(16);
		numeros.add(15);
		numeros.add(13);
		numeros.add(12);
		numeros.add(10);
		for(Integer numero:numeros) {
			System.out.println(numero);
		}
		
		
	}
}
