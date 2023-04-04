package heranca.desafio;

public class Carro {
	protected double velocidade;
	protected final double velocidadeMax; 
	protected double fatorAceleracao;
	 double fatorDesaceleracao;
	public Carro(){
		this(100);
	}
	public Carro (double VELOCIDADE_MAXIMA){
		this.velocidadeMax=VELOCIDADE_MAXIMA;
		this.velocidade = 0;
		this.fatorAceleracao=10;
		this.fatorDesaceleracao=10;
	}
	public void acelerar() {
		if(this.velocidade<=velocidadeMax) 
			velocidade+=fatorAceleracao;
		if(velocidade>velocidadeMax)
			velocidade=velocidadeMax;
		System.out.println("Velocidade: "+velocidade+"Kmh");
	}
	public void frear() {
		if(this.velocidade>=0) 
			velocidade-=fatorDesaceleracao;
		if(velocidade<0)
			velocidade=0;
		System.out.println("Velocidade: "+velocidade+"Kmh");
	}
}
