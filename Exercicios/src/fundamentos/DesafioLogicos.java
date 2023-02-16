package fundamentos;

public class DesafioLogicos {
	public static void main(String[] args) {
		//trabalho na terça e na quinta 
		//1 trabalho tv 32
		//2 trabalhos tv 51
		String texto;
		boolean trabalho1 = true,
				trabalho2 = true;
		if(trabalho1) {
			texto = "O primeiro trabalho deu certo ";
		}else {
			texto = "O primeiro trabalho deu errado ";
		}
		if(trabalho2) {
			texto += "e o segundo trabalho deu certo ";
		}else {
			texto += "e o segundo trabalho deu errado ";
		}
		texto += "portanto";
		if(trabalho1 && trabalho2) {
			texto += ", vamos ao shopping comprar a tv de 52 polegadas, e tomar sorvete";
		}else if(trabalho1 ^ trabalho2) {
			texto += ", vamos ao shopping comprar a tv de 32 polegadas, e tomar sorvete";
		}else if(!(trabalho1 && trabalho2)) {
			texto += ", ficamos em casa chupando o dedo";
			
		}
}
}