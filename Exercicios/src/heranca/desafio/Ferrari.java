package heranca.desafio;

public class Ferrari extends Carro{
	public Ferrari(){
		super(300);
		super.fatorAceleracao=30;
		super.fatorDesaceleracao=50;
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


