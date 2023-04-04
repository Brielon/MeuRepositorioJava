package streams;

import java.util.Arrays;
import java.util.List;

public class DesafioFilter {
	public static void main(String[] args) {
		Recruta r0 = new Recruta("Pericles",20,1.80);
		Recruta r1 = new Recruta("Percival",17,1.75);
		Recruta r2 = new Recruta("Frederico",18,1.60);
		Recruta r3 = new Recruta("Fernando",21,1.86);
		Recruta r4 = new Recruta("Paulo",28,1.50);
		Recruta r5 = new Recruta("Peregrino",68,1.79);
		Recruta r6 = new Recruta("Arlindo",21,1.82);
		
		List<Recruta> Recrutas = Arrays.asList(r0,r1,r2,r3,r4,r5,r6);
		
		Recrutas.stream()
				.filter(r -> r.altura>=1.70&&r.altura<=1.85)
				.filter(r -> r.idade>=18&&r.idade<=25)
				.map(r -> "O recruta "+r.nome+" esta apto para o serviço militar")
				.forEach(System.out::println);
		 
	}
}	
