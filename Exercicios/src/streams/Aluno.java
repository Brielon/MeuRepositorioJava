package streams;

public class Aluno {
	final String nome;
	final double media;
	final boolean bomComportamento;
	Aluno(String nome,double media){
		this(nome,media,true);
	}
	Aluno(String nome,double media,boolean bomComportamento){
		this.nome=nome;
		this.media=media;
		this.bomComportamento=bomComportamento;
	}
	
	public boolean equals(Aluno obj) {
		return obj.nome.contains(this.nome);
	}
}
