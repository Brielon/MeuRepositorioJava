package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Filter {
	public static void main(String[] args) {
		Aluno a0 = new Aluno("Rodrigo",8);
		Aluno a1 = new Aluno("Raimundo",9.9);
		Aluno a2 = new Aluno("Raimunda",4.7);
		Aluno a3 = new Aluno("Reinaldo",10);
		Aluno a4 = new Aluno("Pericles",9);
		Aluno a5 = new Aluno("Percival",3);
		Aluno a6 = new Aluno("Peregrina",5);
		Aluno a7 = new Aluno("Ranialisson",8.9);
		Aluno a8 = new Aluno("Frederico",7.0);
		Aluno a9 = new Aluno("Frrancisco",8.6);
		List<Aluno> alunos = Arrays.asList(a0,a1,a2,a3,a4,a5,a6,a7,a8,a9);
		alunos.stream()
		.filter(a -> a.media >=6)
		.map(a -> a.nome+" parabens voce passou")
		.forEach(System.out::println); 
		
	}
}
