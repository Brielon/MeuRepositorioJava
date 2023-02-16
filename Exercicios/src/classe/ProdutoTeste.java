package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		produto n1 = new produto("carro",9000,0.5);
		produto n2 = new produto("carro1",9000);
		System.out.println(n1.apresentar()); 
		System.out.println(n2.apresentar()); 
	}
} 
