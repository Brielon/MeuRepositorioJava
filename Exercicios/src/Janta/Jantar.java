package Janta;

public class Jantar {
	public static void main(String[] args) {
		//criar 2 comidas
		//1 pessoa
		Pessoa Joao = new Pessoa("Joao",70);//peso em quilos 1000gramas == 1kl
		Comida Feijoada = new Comida("Feijoada",500);//peso em gramas
			Comida	Mandioca = new Comida("Mandioca",100);
		System.out.println(MostrarPessoa(Joao));
		Joao.comeu(Feijoada);
		Joao.comeu(Mandioca); 
		
		System.out.println(MostrarPessoa(Joao));
	}
	static String  MostrarPessoa(Pessoa p) {
		return p.nome+" tem "+p.peso/1000+"kl";
	}
}
