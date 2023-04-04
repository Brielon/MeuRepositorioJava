package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

import javax.annotation.processing.SupportedSourceVersion;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		fila.add("Ana");
		fila.offer("brito");
		fila.add("henrrique");
		fila.offer("pafunco");
		fila.add("jafungo");
		fila.offer("paralamas");
		fila.add("dussuucesso");
		fila.offer("aribaba");
		//enfim....offer e add adicionam elementos a fila contudoo comportamento e diferente quando a fila esta cheia
		//sendo que offer retorna falço se n conceguir e add retorna um erro
		//System.out.println(fila.peek()); //retorna null se a fila estiver vazia
		//System.out.println(fila.element());//retornma um erro cassso a fila estiver vazia
		//fila.size --> retorna o tamanho da fila
		//fila.clear --> limpa a fila
		//fila.isEmpty --> retorna se a fila esta vazia
		//System.out.println(fila.poll());
		//System.out.println(fila.poll());
		//System.out.println(fila.poll());
		//System.out.println(fila.poll());
		//System.out.println(fila.poll());
		System.out.println(fila.poll());//remove um elemento e retorna o nome dele caso nao haja elemetos 
		//para serem removidos o mesmo retorna null
		System.out.println(fila.remove());//mesmo comportamento do poll contudo retorna um erro caso nao haja elemrntos a serem removidos
		//System.out.println(fila.poll());
		//System.out.println(fila.poll());

		
	}
}
