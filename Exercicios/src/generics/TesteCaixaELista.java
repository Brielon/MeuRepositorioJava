package generics;

import java.util.Arrays;
import java.util.List;

public class TesteCaixaELista {
	public static void main(String[] args) {
		Caixa<String> MyBox =new Caixa<>();
		MyBox.guardar("Escrita");
		MyBox.mostrar();
		CaixaDeInteiros MyIntegerBox = new CaixaDeInteiros();
		MyIntegerBox.guardar(5);
		MyIntegerBox.mostrar();
		CaixaDeNumeros<Double> MyNumberBox = new CaixaDeNumeros<>();
		MyNumberBox.guardar(5.6);
		MyNumberBox.mostrar();
		List<Integer> teste = Arrays.asList(1,2,3,7,4,5,6 );
		System.out.println(MyListGeneric.UltimoItem(teste));
		
		
		
	}
}
