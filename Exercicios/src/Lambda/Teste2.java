package Lambda;

import java.util.function.BinaryOperator;

import javax.annotation.processing.SupportedSourceVersion;

public class Teste2 {
	public static void main(String[] args) {
		//nao permitido int -> Double
		//permitido double -> Double
		BinaryOperator<Double> conta = (a,b) -> {//aqui foi definido como Double
			//entao quando for pegar os parametros os mesmos deven ser no minimo double
			System.out.println("A soma e:");
		return a+b;
		};
		//conta = (x,y) -> x*y;//parametro->"flecha lambda"implementacao "return"
		System.out.println(conta.apply(2.0, 3.0));//apply executa a funcao 
		//BinaryOperator recebe 2 tipos e retorna 1 tipo sendo os 3 o mesmo tipo ex:
		//(int , int)return int;
		 
		

	}
}