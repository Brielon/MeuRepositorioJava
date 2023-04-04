package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	public static void main(String[] args) throws SQLException{
		final String url = "jdbc:mysql://localhost:3306?us";
		final String usuario = "root";
		final String senha = "1234";
		
		Connection conexao = DriverManager
				.getConnection(url,usuario,senha);
		
		System.out.println("Conectado");
		conexao.close();
	}
}
