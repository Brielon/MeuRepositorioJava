package campo.br.com.angelo.inicial;

import java.util.Scanner;

import campo.br.com.angelo.Tabuleiro.tabuleiro;

public class inicial {
	private boolean continuar = true;
	private Scanner entra = new Scanner(System.in);
	public inicial(int x,int y,int minas){		
		play(x,y,minas);
	}

	private void play(int x,int y,int minas) {
		// TODO Auto-generated method stub
		do {
			System.out.println("Nova Partida?(S/n)");
				continuar = entra.next().equalsIgnoreCase("s");
				if(continuar) {
					new tabuleiro(x,y,minas);
					
				}
		}while(continuar);
		System.out.println("Adeus");
	}
}
