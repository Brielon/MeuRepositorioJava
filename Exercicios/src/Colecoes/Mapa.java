package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String>usuarios = new HashMap<>();//<Key Value>
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rebeca");
		usuarios.put(4, "Reinaldo");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(4));
		System.out.println(usuarios.containsValue("Roberto"));
		
		System.out.println(usuarios.get(4));
		
		for(int chave:usuarios.keySet()) {
			System.out.println(chave);
		}
		for(String valor:usuarios.values()) {
			System.out.println(valor);
		}
		for(Entry<Integer, String>registro:usuarios.entrySet()) {
			System.out.println(registro.getKey()+"===>"+registro.getValue());
		}
		
		
	}
}
