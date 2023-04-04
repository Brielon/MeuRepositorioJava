package teste_acesso;

import heranca.desafio.Carro;
import heranca.desafio.Corsa;
import heranca.desafio.Ferrari;

public class Garagem {
	public static void main(String[] args) {
		Carro Ferrari = new Ferrari();
		Carro Corsa = new Corsa();

		Corsa.acelerar();
		Corsa.acelerar();
		Ferrari.acelerar();
		Carro carro = new Carro();
		
	} 
}