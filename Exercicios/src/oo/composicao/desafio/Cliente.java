package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
	private String nome;
	private ArrayList<Item> NovoItem =new ArrayList<>();
	Cliente (String nome){
		this.nome = nome;
	}
	void AdicionarAoCarrinho(int qtd,String nome, double preco) {
	 	boolean FoiIncrementado = false;
		FOR : for(int i = 0;i<NovoItem.size();i++ ) {
			if((NovoItem.get(i).produtos.nome).equals(nome)&&
					(NovoItem.get(i).produtos.preco==preco)) {
				NovoItem.get(i).qtd+=qtd;
				FoiIncrementado = true;
				break FOR; 
			}
		}
		if(!FoiIncrementado)
			NovoItem.add(new Item(qtd,nome,preco));
	}
	void Status() {
//		NovoItem.
		boolean ComprouAlgo = !(NovoItem.isEmpty());
		System.out.println("Ola meu nome e "+this.nome);
		System.out.println(ComprouAlgo?
				"Eu comprei:":"e eu ainda nao comprei nada");
		if(ComprouAlgo)ListaDeCompras();
	}
	private void ListaDeCompras() {
		for(int i =0;i<NovoItem.size();i++) {
			int qtd = NovoItem.get(i).qtd;
			double preco = NovoItem.get(i).produtos.preco;
			String nome = NovoItem.get(i).produtos.nome;
			
			System.out.println("X"+qtd+" "+nome+" que custan R$"+preco+" cada");
		}
		total();
	}
		private void total() {
		double total = 0;
		int CarrinhoSize = NovoItem.size();
		for(int i = 0;i<CarrinhoSize;i++) {
			int quantidade = NovoItem.get(i).qtd;
			double preco = NovoItem.get(i).produtos.preco;
			total +=quantidade*preco;
		}
		System.out.println("O total das compras e R$"+total);
	}
}
