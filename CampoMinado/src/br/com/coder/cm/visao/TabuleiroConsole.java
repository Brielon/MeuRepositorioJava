package br.com.coder.cm.visao;

import java.util.Scanner;

import br.com.coder.cm.excecao.ExplosaoEception;
import br.com.coder.cm.excecao.SairException;
import br.com.coder.cm.modelo.tabuleiro;

public class TabuleiroConsole {
	private tabuleiro Tabuleiro;
	private Scanner entrada = new Scanner(System.in);
	public TabuleiroConsole(tabuleiro tb){
		Tabuleiro = tb;
		
		executar();
	}

	private void executar() {
		try {
			boolean continuar = true;
			while(continuar) {
				ciclo();
				System.out.println("Outra partida (S/n)");
				continuar = entrada.next().toLowerCase().contains("n")?false:true;
				
			}
		}catch(SairException e) {
			System.out.println("Thau!!!");
		}
		finally {
			entrada.close();
		}
		
	}

	private void ciclo() {
		try {
			
			while(!Tabuleiro.ObjetivoAlcancado()) {
				System.out.println(Tabuleiro);
				String digitado = capturarValorDigitado("Digite (x,y): ");
				char[] digit = digitado.toCharArray(); 
					if(digit.length<3) {
						System.out.println("Invalido");
						continue;
			}
				char xcaractere = digit[0];
				char ycaractere = digit[2];
				int x=(((int)xcaractere)-49);
				int y=(((int)ycaractere)-49);
				digitado = capturarValorDigitado("1-Abrir\n2-Marcar");
				if("1".equals(digitado)) {
					Tabuleiro.abrir(y, x);
				}
				if("2".equals(digitado)) {
					Tabuleiro.marcar(y, x);					
				}
				
			}
			if(Tabuleiro.ObjetivoAlcancado()) {
				
			}
			
			System.out.println("Voce Ganhou");
		} catch (ExplosaoEception e) {
			
			System.out.println("Voce Perdeu");
			System.out.println(Tabuleiro.estourado());
		}
		
		
	}

	private String capturarValorDigitado(String texto) {
		System.out.println(texto);
		String digitado = entrada.nextLine();
		if ("sair".equalsIgnoreCase(digitado))
			throw new SairException();
		
		
		
		return digitado;
	}
}
