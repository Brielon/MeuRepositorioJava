package JDBC;

public class Pessoa {
	private int codigo;
	private String nome;
	public Pessoa() {
		this("teste",00);
	}
	
	public Pessoa(String nome,int codigo) {
		this.codigo=codigo;
		this.nome=nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setcodigo(int codigo) {
		this.codigo=codigo;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.codigo+">>"+this.nome;
	}
}
