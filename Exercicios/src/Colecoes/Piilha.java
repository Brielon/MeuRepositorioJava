package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Piilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		livros.add("O poqueno Principe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.remove());
		System.out.println(livros.pop());//assim como remove retorna um erro casso n haja elemento retorna erro
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		//livros.size();
		//livros.clear();
		//livros.contains();
		//livros.isEmpy();
	}
}
