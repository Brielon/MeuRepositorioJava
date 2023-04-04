package desafioPolimorfismo;

public class Pessoa {
	private final String nome;
	private double peso;
	Pessoa(String nome,double peso){
		this.nome=nome;
		this.setPeso(peso);
	}
	void setPeso(double peso) {
		if(peso > 0&&peso<200)
		this.peso = peso;
	}
	double getPeso() {
		return this.peso;
	}
	void comer (Alimento alimento) {
		setPeso(this.getPeso()+alimento.getPeso());
	}
}
