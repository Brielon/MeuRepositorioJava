package Lambda;

public class Produto {
	final String nome;
	double preco;
	final double desconto;
	Produto(){
		this("Padrao",10.00,0.4);
	}
	Produto(String nome,double preco,double desconto){
		this.nome = nome;
		this.desconto = desconto;
		this.setPreco(preco);
	}
	void setPreco(double preco) {
		this.preco = preco;
	}
	double getPreco() {
		
		return this.preco;
	}
	
}
