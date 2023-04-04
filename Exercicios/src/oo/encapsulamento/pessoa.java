package oo.encapsulamento;

public class pessoa {
	private int idade;
	pessoa(){
		this(20);
	}
	pessoa(int idade){
		this.setIdade(idade);
	}
	//setters
	void setIdade(int idade) {
		if(idade>=0&&idade<200)
		this.idade=idade;
		else
		System.out.println("idade incorreta");
	}
	//getters
	int getIdade() {
		return this.idade; 
	}
}
