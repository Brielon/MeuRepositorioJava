package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner (System.in);
		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		System.out.print("Informe o codigo da pessoa a ser deletada:");
		int cod = entrada.nextInt();
		stmt.setLong(1,cod);
		//stmt.execute();executa e retorna true or false
		//
		int qtd= stmt.executeUpdate();//executa e retorna int de quantas linhas foram alteradas
		
		System.out.println(qtd+" Pessoa deletada com sucesso");
		
	}
}
