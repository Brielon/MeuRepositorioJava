package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana",7.1);
		Aluno a2 = new Aluno("Luna",6.1);
		Aluno a3 = new Aluno("Gui",8.1);
		Aluno a4 = new Aluno("Gabi",10);
		
		
		List<Aluno> Alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<Aluno> aprovado = aluno -> aluno.media>=7;//retorna true or false especial para filtrar
		Function<Aluno, Double> notas = aluno -> aluno.media;
		BinaryOperator<Double> Somatorio =(a,b) -> a+b;
	//	BiFunction<Aluno, Media, Media> (notas,media) = aluno -> {
			
		
		
		Alunos.stream()
				.filter(aprovado)
				.map(notas)
				.reduce(Media)
				.ifPresent(System.out::println);
		}
}
