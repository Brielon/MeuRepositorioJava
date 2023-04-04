package br.com.coder.cm.visao;

import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JPanel;

import br.com.coder.cm.modelo.tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel{
	public PainelTabuleiro(tabuleiro Tabuleiro) {
		setLayout(new GridLayout
				(Tabuleiro.getLinhas(),Tabuleiro.getColunas()));
		Tabuleiro.paraCada(c -> add(new BotaoCampo(c)));
		
	}
}
