package Arrays.teste;

public class Usuario {
	String nome;
	int idade;
	Usuario(String nome,int idade){
		this.nome=nome;
		this.idade=idade;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Usuario) {
		Usuario teste = (Usuario)obj;
		boolean NomeIgual = teste.nome.equals(this.nome);
		boolean IdadeIgual = teste.idade==this.idade; 
		
		return NomeIgual && IdadeIgual;
		}
		return false;
	}
	@Override
	public int hashCode() {//retorna um inteiro
		// TODO Auto-generated method stub
		return this.nome.length();
	}
	
}
