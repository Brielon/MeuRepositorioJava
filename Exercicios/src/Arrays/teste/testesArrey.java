package Arrays.teste;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class testesArrey {
	public static void main(String[] args) {
	Usuario u1 = new Usuario("juvencio",35);
	Usuario u2 = new Usuario("jonas",33);
	Usuario u3 = new Usuario("juvenido",89);
	//System.out.println(u1.equals(new Scanner(System.in)));
	HashSet<Usuario> usuarios = new HashSet<>();
	usuarios.add(u1); 
	usuarios.add(u2); 
	usuarios.add(u3); 
	 boolean resultado = usuarios.contains(new Usuario("juvencio",35));
	 System.out.println(resultado);
	
	
		
		
	}
}
