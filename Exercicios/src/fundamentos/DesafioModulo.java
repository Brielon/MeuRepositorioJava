package fundamentos;

import java.util.Scanner;

public class DesafioModulo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o primeiro numero: ");
		Double primeiro_numero = entrada.nextDouble();
		System.out.println("Informe o segundo numero: ");
		Double segundo_numero = entrada.nextDouble();
		System.out.println("Informe a conta \"/, *, +, -, %\" ");
		String conta = entrada.next();
		double _resposta = 0;
		boolean adicao = conta.contains("+"),
				subtracao = conta.contains("-"),
				divisao = conta.contains("/"),
				multiplicacao = conta.contains("*"),
				resto_divisao = conta.contains("%"),
				AdicaoOuSubtracao = adicao ^ subtracao,
				DivisaoOuMultiplicacao = divisao ^ multiplicacao;
		_resposta = AdicaoOuSubtracao ? //a variavel resposta recebera o resultado do operador ternario 
				 adicao ? primeiro_numero + segundo_numero ://e uma adicao
					 primeiro_numero - segundo_numero : //se n for adicao e subtracao
						 DivisaoOuMultiplicacao ? //n e nem adicao e nem subtracao entao e uma divisao ou uma multiplicacao
								 divisao ? primeiro_numero / segundo_numero : //e uma divisao 
									 primeiro_numero * segundo_numero ://n e uma divisao entao e uma multiplicacao
										 primeiro_numero % segundo_numero;//n e nenhuma outra entao e um resto da divisao
		//adicao ? resposta = primeiro_numero + segundo_numero;
	//	subtracao?resposta = primeiro_numero - segundo_numero:
	//	divisao?resposta = primeiro_numero / segundo_numero:
	//	multiplicacao?resposta = primeiro_numero * segundo_numero:
	//	resto_divisao?resposta = primeiro_numero % segundo_numero:resposta=0;
		
		System.out.printf("%.2f %s %.2f = %.2f",primeiro_numero,conta,segundo_numero,_resposta);
		entrada.close();
	}
}
