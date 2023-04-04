package oo.composicao.desafio;

public class Sistema {
	public static void main(String[] args) {
		Cliente C1 = new Cliente("Rogerio");
		Cliente C2 = new Cliente("Rorlino");
		Cliente C3 = new Cliente("Ana");
		//fazer compra
		C1.AdicionarAoCarrinho(5,"Caneta",1.00);
		C1.AdicionarAoCarrinho(5,"Caneta",1.00);
		C2.AdicionarAoCarrinho(1,"Notebook",1000.00);
		C2.AdicionarAoCarrinho(1,"Notebook",1000.00);
		C2.AdicionarAoCarrinho(1,"Notebook",1000.00);
		C2.AdicionarAoCarrinho(1,"Notebook",1500.00);
		C2.AdicionarAoCarrinho(1,"Notebook",1500.00);
		C3.AdicionarAoCarrinho(1,"Notebook",2000.00);
		C3.AdicionarAoCarrinho(1,"Caneta",10.00);
		C3.AdicionarAoCarrinho(1,"Cadeira",200.00);
		C3.AdicionarAoCarrinho(1,"caderno",10.00);
		C3.AdicionarAoCarrinho(2,"Silicone",30000.00);
		
		//retorna oque ele comprou o 
		//nome dele e o valor do carrinho
		C1.Status();
		C2.Status();
		C3.Status();
		
 
		
	}
}
