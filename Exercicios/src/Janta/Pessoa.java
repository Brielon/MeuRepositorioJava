package Janta;

public class Pessoa {
	String nome;
	double peso;
	Pessoa(String nome,double peso){
		this.nome = nome;
		this.peso = peso*1000;
	}
	void comeu(Comida lanche) {
		this.peso += lanche.peso;
	}
	
	
}
