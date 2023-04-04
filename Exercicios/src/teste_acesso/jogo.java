package teste_acesso;

import heranca.Heroi;
import heranca.Monstro;
import heranca.jogador;

public class jogo {
	public static void main(String[] args) {
		jogador j1 = new Heroi("Rodolfo",100,10,10); 
		jogador j2 = new Monstro("Frederico",100,10,11);
		j1.Ataque(j2);
		j2.Ataque(j1);
		j1.Ataque(j2);
		j2.Ataque(j1);
		j1.Ataque(j2);
		j2.Ataque(j1);
		j1.Ataque(j2);
		j2.Ataque(j1);
		j1.Ataque(j2);
		j2.Ataque(j1);
		j1.Ataque(j2);
		j2.Ataque(j1);
		j1.Ataque(j2);
		j2.Ataque(j1);
		j1.Ataque(j2);
		j2.Ataque(j1);
		j1.Ataque(j2);
		j2.Ataque(j1);
		j1.Ataque(j2);
		j2.Ataque(j1);
		j1.Ataque(j2);
		j2.Ataque(j1);
		j1.Ataque(j2);
		j2.Ataque(j1);

		


	}
}
