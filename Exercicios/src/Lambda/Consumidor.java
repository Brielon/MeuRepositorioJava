package Lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		//recebe parametro e retrna void ou seja nada
		//Consumer<String> Consu = texto -> System.out.println(texto+"teste de Consumer");
		//Consu.accept("valido");
		//void MostrarProduto(p1){
		//System.out.println();
		//};
		Consumer<Produto> MostrarProduto = p1 -> 
		System.out.printf("%s custa R$%.2f pois teve o desconto de %s\n",
				p1.nome,p1.getPreco(),p1.getDesconto());
		Produto pPadrao = new Produto();
		MostrarProduto.accept(pPadrao); 
		ArrayList<Produto> ListaDeProdutos = new ArrayList<>();
		ListaDeProdutos.add(new Produto());
		ListaDeProdutos.add(new Produto());
		ListaDeProdutos.add(new Produto());
		ListaDeProdutos.add(new Produto());
		ListaDeProdutos.add(new Produto());
		ListaDeProdutos.forEach(MostrarProduto);
		ListaDeProdutos.forEach(p->System.out.println(p.nome));
		ListaDeProdutos.forEach(System.out::println);//tem que implementar o metodo toString 
		
		
		
		
	}
}
