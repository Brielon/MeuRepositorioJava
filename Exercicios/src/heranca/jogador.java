package heranca;

public class jogador{
	
	String nome;
	double vida;
	int x;
	int y;
	double dano = 10;
	public jogador(){
		//para poder gerar herança o super construtor explicito deve existir
	}
	
	public jogador(String nome,double vida,int x,int y){
		this.nome=nome;
		this.vida=vida;
		this.x=x;
		this.y=y;
	}

	boolean andar(Direcao direcao) {
		switch (direcao) {
		case NORTE:
			this.y--;
			break;
		case SUL:
			y++;
			break;
		case LESTE:
			x++;
			break;
		case OESTE:
			x--;
			break;
		}
		return true;
	}
	public boolean Ataque(jogador JOGADOR) {
		if(Math.abs(this.x-JOGADOR.x)<=1
				&&Math.abs(this.y-JOGADOR.y)<=1) {
			JOGADOR.vida-=this.dano;
			return true; 
		}
		return false;
	}
	boolean Ataque(jogador JOGADOR,double dano) {
		if(Math.abs(this.x-JOGADOR.x)<=1
				&&Math.abs(this.y-JOGADOR.y)<=1) {
			JOGADOR.vida-=dano;
			return true; 
		}
		return false;
	}
	void status() {
		if(this.vida<=0) {
			System.out.println(this.nome+" morreu");
		}
		else {
		System.out.println(this.nome+"HP: "+this.vida+"pt"+" esta na posicao \nX: "+
				this.x+" Y: "+this.y);
		}
	}

}
