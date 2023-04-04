package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		//buscar pessoas apartir de partes dos nomes
		System.out.println("Busca pessoa:");
		Scanner entrada = new Scanner (System.in);
		String nome = "%"+entrada.nextLine()+"%";
		String sql = "SELECT * FROM pessoas WHERE nome like (nome)";
		//PreparedStatement stmt = conexao.prepareStatement(sql);
		//stmt.setString(1, nome);
		//stmt.executeQuery();
		Statement stmt = conexao.createStatement();
		ResultSet resultado = stmt.executeQuery(sql.replace("(nome)", "'"+nome+"'")); 
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nomee = resultado.getString("nome");
			pessoas.add(new Pessoa(nomee,codigo));
		}
		for(Pessoa p : pessoas) {
			System.out.println(p);
		}

		
		
		
	}
}
