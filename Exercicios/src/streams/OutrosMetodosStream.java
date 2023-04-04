package streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodosStream {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana",7.1);
		Aluno a2 = new Aluno("Luna",6.1);
		Aluno a3 = new Aluno("Gui",8.1);
		Aluno a4 = new Aluno("Gui",8.1);
		Aluno a5 = new Aluno("Gui",8.1);
		Aluno a6 = new Aluno("Gabi",10);
		Aluno a7 = new Aluno("Gabi",10);
		Aluno a8 = new Aluno("Gabi",10);
		
		
		List<Aluno> Alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
		
		System.out.println("Distincs...");//ve se tem repetidos
		Alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		Alunos.stream()
			.distinct()
			.skip(1)
			.limit(2)
			.forEach(System.out::println); 
		
		System.out.println("\ntakeWile");
		Alunos.stream()
		.distinct()
		.skip(1)
		.takeWhile(n -> n.media>=7)
		.forEach(System.out::println); 
		
		
	}
}
