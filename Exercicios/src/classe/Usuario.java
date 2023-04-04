package classe;

public class Usuario {
	String nome;
	String email;
	Usuario(String nome){
		this.nome = nome;
		this.email = nome.replace(" ", ".")+"@dominio.com";
	}
	String RetornaUsuario() {
		return "nome: "+nome+"\nemail: "+email;
	}
	void ApresentaUsuario() {
		System.out.println(this.RetornaUsuario());
	}
}
