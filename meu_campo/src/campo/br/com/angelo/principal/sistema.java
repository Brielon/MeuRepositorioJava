package campo.br.com.angelo.principal;

import campo.br.com.angelo.inicial.inicial;

public class sistema {
	sistema(int x,int y,int minas){
		new inicial(x,y,minas);
	}
	public static void main(String[] args) {
		//altura largura qtd_minas 
		//limitado a 10 X 10 por erro na semantica
		
		new sistema(10,10,100);
	}
}
