package Colecoes;

public class Usuario {
	String nome;
	String email = this.email(nome);// = (nome.replace(" ", ".")+"@dominio.com.br").toLowerCase();
	Usuario(String nome){
		this.nome = nome;
	}
	String RetornaUsuario() {
		return "nome: "+nome+"\nemail: "+email;
	}
	void ApresentaUsuario() {
		System.out.println(this.RetornaUsuario());
	}
	void AdicionaUsuario(String nome) {
		this.nome = nome;
	} 
	String email(String nome) {
		if(nome == null) nome = "nome null";
		return (nome.replace(" ", ".")+"@dominio.com.br").toLowerCase();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Meu nome e: "+nome+"\nE o meu email e: "+email;
	}
	public int hashCode() {
		return 31 * 1 + ((nome == null)?0:nome.hashCode());
	}
	public boolean equals(Object obj) {
		/*if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if(nome ==null) {
			if(other.nome != null)
				return false;
		}else if(!nome.equals(other.nome))
			return false;
		return true;*///esta e a soluçaom dada pelo professor
		//minha soluçao
		boolean verdadeiro = this==obj || !(obj==null) || getClass() == obj.getClass();
		return verdadeiro?true:false; 
	}
}
