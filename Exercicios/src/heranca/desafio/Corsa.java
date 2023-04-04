package heranca.desafio;

public class Corsa extends Carro{
	public Corsa(){
		super(90);
		super.fatorAceleracao=5;
		super.fatorDesaceleracao=20;
	}
	@Override
	public void acelerar() {
		super.acelerar();
	}
	@Override
	public void frear() {
		super.frear();
	}
}

/**
 * A classe filho chama o constrtutor padrao
 * corsa(){
 * super();
 * }
 * como o mesmo nao existe e sim 
 * carro(velocidademaxima ){
 * }
 * deve ser alterado o superda mesma maneira
 * corsa(){
 * super(90);
 * }
 * quando chamo mo construtor padrao agr do corsa ele ja aplica automaticamente 90 kmh no construtor
 * padrao do carro 
 * 
 * 
 */
