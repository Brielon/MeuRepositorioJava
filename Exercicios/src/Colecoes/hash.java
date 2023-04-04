package Colecoes;

import java.util.HashSet;

public class hash {
	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<>(); 
		usuarios.add(new Usuario("Henrrique"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Bernardo"));
		System.out.println(usuarios.contains(new Usuario("Henrrique")));
	}
}
