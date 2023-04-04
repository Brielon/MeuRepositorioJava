package campo.br.com.angelo.Tabuleiro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import campo.br.com.angelo.Campo.campo;

public class tabuleiro {
	private final int linhas;
	private final int colunas;
	private final int qtd_minas;
	private int qtd_campos;
	private int minas_ja_colocadas;
	private final List<campo> campos=new ArrayList();
	public tabuleiro(int x,int y,int minas){
		linhas = y;
		colunas = x;
		qtd_minas=minas;
		qtd_campos= y*x;
		
		criar_campos();
		AleatorizarMinas();
		iniciar();
	}
	private void iniciar() {
		boolean OK = true;
		Scanner entra = new Scanner(System.in);
		do {
			ApresentaTabuleiros();
			System.out.println("Informe X:");
			int x = entra.nextInt();
			System.out.println("Informe Y:");
			int y = entra.nextInt();
			System.out.println("1)Marcar/Desmarcar\n2)Abrir");
			int resposta = entra.nextInt();
			if(resposta==1) {
				campos.get(x*y).marcar();
			}

		}while(OK);	
	}
	private void AleatorizarMinas() {
		while(qtd_minas>minas_ja_colocadas) {
			int campo_aleatorio;
			do {
			campo_aleatorio = (int) (Math.random()*qtd_campos);
			}while(campos.get(campo_aleatorio).isMined());
			campos.get(campo_aleatorio).minar();
			minas_ja_colocadas++;		
		}
	}
	private void ApresentaTabuleiros() {
		int cnt = 0;
		String cabecalho = "  ";
		for(int i = 0;i<colunas;i++) {
			cabecalho += " "+i+" ";
		}
		System.out.println(cabecalho);
		for(int x=0;x<colunas;x++) {
			System.out.print(x+" ");
			for(int y=0;y<linhas;y++) {
				System.out.print(campos.get(cnt).toString());
				cnt++;
			}
			System.out.println("");
		}
	}
	private void criar_campos() {
		// TODO Auto-generated method stub
		for(int i=0;i<qtd_campos;i++) {
			campos.add(new campo());
		}
	}
}
