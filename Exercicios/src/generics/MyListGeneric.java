package generics;

import java.util.List;

public class MyListGeneric {
	public static <TIPO> TIPO UltimoItem(List<TIPO> lista){
		return lista.get(lista.size()-1);
	}
}
