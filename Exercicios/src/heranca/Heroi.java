package heranca;

public class Heroi extends jogador{
	public Heroi(String nome,double vida,int x,int y){
		this.nome=nome;
		this.vida=vida;
		this.x=x;
		this.y=y; 
	}
	boolean Ataque(jogador JOGADOR) {
		//super.Ataque(JOGADOR);
		boolean ataque = super.Ataque(JOGADOR);//o ataque e feito e retorna o valor boolean 
		super.status();
		System.out.println(ataque?
				"O Heroi teve o ataque bem sucedido":"O Heroi teve o ataque mal sucedido");
		System.out.println("HP Inimigo: "+JOGADOR.vida);
		return ataque;
	}
}