package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	public static void main(String[] args) {
		HashSet a = new HashSet();//criou conjunto 'a' 
		
		a.add(1.2);
		a.add(true);
		a.add("Teste");//add() adiciona membro
		a.add(1);
		a.add('x');
		
		System.out.println(a);
		
		a.add("Teste");
		System.out.println(a);
		a.remove(true);//remove menbro
		System.out.println(a); 
		//mostre(conjunto.contains(true));
		Set b = new HashSet();//criou conjunto 'b' 
		b.add(1);
		b.add(2);//add() adiciona ao membro
		b.add(3);
		a.retainAll(b);//adiciona tudo q tem no conjunto 'a' ao conjunto 'b'
		a.clear();//limpa o conjunto
		//falta intercessaon  
		
		
	}
}
