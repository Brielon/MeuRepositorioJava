package Lambda;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		//recebe 1 parametro e retorna boolean
		Predicate<Produto> isCaro = prod -> prod.getPreco()>=10?true:false;
		//nome - preco - desconto
		Produto produto = new Produto("Chinelo",20,0.6);
		//predicado tem a funcao padrao test
		System.out.println(isCaro.test(produto));
	}
}
