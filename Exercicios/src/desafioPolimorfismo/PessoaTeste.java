package desafioPolimorfismo;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Rodolfo",99.5);
		Alimento a1 = new Sorvete();
		Alimento a2 = new Feijao();
		Alimento a3 = new Arros();
		p1.comer(a1);
		p1.comer(a2);
		p1.comer(a3);
		System.out.println(p1.getPeso());
	}
}
