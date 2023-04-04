package desafioPolimorfismo;

public abstract class Alimento {//nao pode ser implementada
	
	private double peso;
	Alimento(){
		this.setPeso(0.1);
	}
	Alimento(double peso){
		this.setPeso(peso);
	}
	double getPeso() {
		return this.peso;
	}
	void setPeso(double peso) {
		if(peso>0)
		this.peso=peso;
		else
		System.out.println("peso incorreto");
	}
}
