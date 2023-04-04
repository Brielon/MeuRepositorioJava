package br.com.coder.cm.visao;

import javax.swing.JFrame;

import br.com.coder.cm.modelo.tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame{
	
	public TelaPrincipal() {
		tabuleiro tb = new tabuleiro(16,30,50);
		add(new PainelTabuleiro(tb));
		
		setTitle("Campo Minado");
		setSize(679,438);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TelaPrincipal();
	}
}
