package br.com.coder.visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Teclado extends JPanel{
	private final Color COR_CINZA_ESCURO = new Color(68,68,68);
	private final Color COR_CINZA_CLARO = new Color(99,99,99);
	private final Color COR_LARANJA = new Color(242,163,60);
	public Teclado() {
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		
		setLayout(layout);
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 2;
		add(new Botao("AC",COR_CINZA_ESCURO),c);
		c.gridx = 2;
		c.gridy = 0;
		c.gridwidth = 1;
	
		add(new Botao("+/-",COR_CINZA_ESCURO),c);

		c.gridx = 3;
		c.gridy = 0;
		add(new Botao("÷",COR_LARANJA),c);
		c.gridx = 0;
		c.gridy = 1;

		add(new Botao("7",COR_CINZA_CLARO),c);
		c.gridx = 1;
		c.gridy = 1;
		add(new Botao("8",COR_CINZA_CLARO),c);
		c.gridx = 2;
		c.gridy = 1;
		add(new Botao("9",COR_CINZA_CLARO),c);
		c.gridx = 3;
		c.gridy = 1;
		add(new Botao("x",COR_LARANJA),c);
		c.gridx = 0;
		c.gridy = 2;
		add(new Botao("4",COR_CINZA_CLARO),c);
		c.gridx = 1;
		c.gridy = 2;
		add(new Botao("5",COR_CINZA_CLARO),c);
		c.gridx = 2;
		c.gridy = 2;
		add(new Botao("6",COR_CINZA_CLARO),c);
		c.gridx = 3;
		c.gridy = 2;
		add(new Botao("-",COR_LARANJA),c);
		c.gridx = 0;
		c.gridy = 3;
		
		add(new Botao("1",COR_CINZA_CLARO),c);
		c.gridx = 1;
		c.gridy = 3;
		add(new Botao("2",COR_CINZA_CLARO),c);
		c.gridx = 2;
		c.gridy = 3;
		add(new Botao("3",COR_CINZA_CLARO),c);
		c.gridx = 3;
		c.gridy = 3;
		add(new Botao("+",COR_LARANJA),c);
		c.gridx = 0;
		c.gridy = 4;
		c.gridwidth = 2;
		
		add(new Botao("0",COR_CINZA_CLARO),c);
		c.gridx = 2;
		c.gridy = 4;
		c.gridwidth = 1;

		add(new Botao(",",COR_CINZA_CLARO),c);
		c.gridx = 3;
		c.gridy = 4;
		add(new Botao("=",COR_LARANJA),c); 
	}
}
