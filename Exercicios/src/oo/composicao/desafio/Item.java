package oo.composicao.desafio;

public class Item {
	produto produtos;
	int qtd;
	Item (int qtd, String nome_produto, double valor){		
		produtos = new produto(nome_produto,valor);
		this.qtd = qtd; 
		
	}
}  
