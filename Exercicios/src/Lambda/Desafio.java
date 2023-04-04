package Lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Desafio {
	public static void main(String[] args) {
		Produto p=new Produto("Ipad",3235.89,0.13);
		/**
		 * 1.Calcular desconto
		 * 2.imposto
		 * 3.frete
		 * 4.arredondar
		 * 5formatar
		 */
		BiFunction<Double, Double, Double> CalculoDesconto = (Valor,Desconto) ->
		Valor*(1-Desconto);
		Function<Double, Double> Imposto = Valor ->
		Valor>=2500?Valor*1.085:Valor;
		Function<Double, Double> Frete = Valor ->
		Valor>=300?Valor+100:Valor+50;
		Function<Double, String> Arredondar = Valor ->
		String.format("%.2f", Valor);
		Function<String, String> Formatar = Valor ->"R$"+Valor;
		String Resultado = CalculoDesconto
				.andThen(Imposto)
				.andThen(Frete)
				.andThen(Arredondar)
				.andThen(Formatar)
				.apply(p.preco, p.desconto);
		System.out.println(Resultado);
		 
		
		
	}
}
