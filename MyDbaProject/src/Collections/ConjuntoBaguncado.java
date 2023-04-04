package Collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	public static void main(String[] args) {
		//polimorfismo
		//quando nao e usado generics o set aceita qualquer tipo de dado
		Set conjunto = new HashSet();
		conjunto.add(1);
		conjunto.add("aril");
		conjunto.add(24);
		conjunto.add('c');
		conjunto.add("barco");
		conjunto.add(false);
		conjunto.add("a");
		System.out.println("Add...");
		System.out.println(conjunto.add(1));//retorna negativo se n conceguir adicionar
		
		System.out.println(conjunto.add(10));//e positivo quando conceguue
		System.out.println(conjunto.size());//retorna a quantidade de menbros do conjunto
		
		System.out.println("Remove...");
		System.out.println(conjunto.remove("a"));
		System.out.println(conjunto.remove("a"));
		System.out.println(">>contains:");
		
		for(Object teste:conjunto) {//passando um object ele pode ser passado ao foreach
			System.out.println(teste);
		}
		
		
		
 	}
}
