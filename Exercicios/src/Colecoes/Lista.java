package Colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista_de_usuarios = new ArrayList<>();
		lista_de_usuarios.add(new Usuario("Antonio Ferrolho"));
		lista_de_usuarios.add(new Usuario("Rodrigo"));
		lista_de_usuarios.add(new Usuario("Fernando"));
		lista_de_usuarios.add(new Usuario("malaquias"));
		lista_de_usuarios.add(new Usuario("merivaldo"));
		lista_de_usuarios.add(new Usuario("marilinda"));
		lista_de_usuarios.add(new Usuario("rosalina"));
		lista_de_usuarios.add(new Usuario("peregrinis"));
		for(int i =0 ;i<lista_de_usuarios.size();i++) {
		System.out.println(lista_de_usuarios.get(i));
		}
		/*Usuario[] ArrayUsuarios = new Usuario[5];
		ArrayUsuarios[0].AdicionaUsuario("Antonio");
		ArrayUsuarios[1].AdicionaUsuario("Rodrigo");
		ArrayUsuarios[2].AdicionaUsuario("Fernando");
		ArrayUsuarios[3].AdicionaUsuario("malaquias");
		ArrayUsuarios[4].AdicionaUsuario("merivaldo");
		for(int i = 0 ; i < ArrayUsuarios.length;i++) {
			ArrayUsuarios[i].ApresentaUsuario();
		}*/
		//hach n da pra 
		
	}
}
