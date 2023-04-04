package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	public static void main(String[] args) {
//		retorna algo senfo que nao recebe nada assim como um fornecedor faz
//		String umlista(){
		//Arrays.asList("Ana","Bia","Lia","Gui");
		//System.out.println(umlista.get());
		
		Supplier<List<String>> umlista = () -> Arrays.asList("Ana","Bia","Lia","Gui");
		System.out.println(umlista.get());
	}
}
