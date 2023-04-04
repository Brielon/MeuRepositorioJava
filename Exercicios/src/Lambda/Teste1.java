package Lambda;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.SupportedSourceVersion;

public class Teste1 {
	public static void main(String[] args) {
		//Calculo conta = (a,b) -> {
		//	System.out.println("A soma e:");
		//return a+b;
		//};
		//conta = (x,y) -> x*y;//parametro->"flecha lambda"implementacao "return"
		//System.out.println(conta.executar(2, 3));
		Calculo conta = a -> a+1;//quando ha apenas 1 nao precisa de (a)->{return a+1;};
		int a = 1;
		System.out.println(conta.executar(a));//retorna 2;
		//for(int i = 0;i<10;i -> {
		//	System.out.println("2x"+i+"="+2*i);
	//		return ++i;
		//});//naao deu certo meu teste
		Integer numeros[]=new Integer[5];
		numeros[0]=2;
		numeros[1]=4;
		numeros[2]=6;
		numeros[3]=23;
		numeros[4]=28;
		for(int numero:numeros) {
			System.out.println(numero);
		}
		List<String> lista = new ArrayList<String>();
		lista.add("Pericless");
		lista.add("Rodolfo");
		lista.add("Roddrighuer");
		lista.add("raimundp");
		System.out.println("forEach referencia");
		lista.forEach(System.out::println); 
		System.out.println("forEach sem referencia n funciona assim");
		//lista.forEach(System.out.println(lista+":")); 
		
		

	}
} 