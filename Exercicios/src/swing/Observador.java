package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
	public static void main(String[] args) {
			JFrame janela= new JFrame("Observador");//Criei uma nova tela
			System.out.println(JFrame.DISPOSE_ON_CLOSE);
			janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			janela.setSize(600,300);
			janela.setLayout(new FlowLayout());
			Scanner entrada = new Scanner(System.in);
			janela.setLocationRelativeTo(null);
			JButton botao = new JButton("Clicar");
			botao.addActionListener(e -> {
				JFrame MinhaJanela = new JFrame("Minha Janela");
				MinhaJanela.setSize(400,300);
				MinhaJanela.setLocationRelativeTo(janela);
				MinhaJanela.setVisible(true);
				
			});
			janela.add(botao);
			
			janela.setVisible(true);
			
			
	}
}
