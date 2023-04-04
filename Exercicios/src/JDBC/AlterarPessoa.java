package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AlterarPessoa {
	public static void main(String[] args) throws SQLException {
		String Encontra = "SELECT * FROM pessoas WHERE codigo = ?";
		String Modifica = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		System.out.println("Informe o codigo da pessoa");
		long cod = entrada.nextInt();
		PreparedStatement stmt = conexao.prepareStatement(Encontra);
		stmt.setLong(1, cod);
		ResultSet resultado = stmt.executeQuery();
		if(resultado.next()) {
			Pessoa p = new Pessoa(resultado.getString("nome"),resultado.getInt("codigo"));
			System.out.println("Nome atual: "+p.getNome());
			System.out.print("Novo nome: ");
			String novoNome;
			entrada.next();
			novoNome = entrada.nextLine();
			p.setNome(novoNome);
			stmt.close();
			PreparedStatement stmt1 = conexao.prepareStatement(Modifica);
			stmt1.setString(1, p.getNome());
			stmt1.setLong(2, p.getCodigo());
			stmt1.execute();
			System.out.println("Pessoa Alterada com sucesso, Novo Nome:\n");
			stmt1.close();
			PreparedStatement stmt2 = conexao.prepareStatement(Encontra);
			stmt2.setLong(1, p.getCodigo());
			resultado = stmt2.executeQuery();
			System.out.println(resultado.getString("nome"));
			
			
			
		}else {
			System.out.println("Pessoa nao existe");
		}
	}
}
