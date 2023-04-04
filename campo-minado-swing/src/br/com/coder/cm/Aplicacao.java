package br.com.coder.cm;

import br.com.coder.cm.modelo.campo;
import br.com.coder.cm.modelo.tabuleiro;
import br.com.coder.cm.visao.TabuleiroConsole;

public class Aplicacao {
	public static void main(String[] args) {
		tabuleiro TBB = new tabuleiro(6,6,6);
		new TabuleiroConsole (TBB);
		
	}
}
