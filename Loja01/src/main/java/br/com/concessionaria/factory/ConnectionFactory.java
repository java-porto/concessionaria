package br.com.concessionaria.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
		public static Connection conexao = null;
		public static final String URL = "jdbc:mysql://192.168.5.40:3306/concessionaria";
		public static final String usuario = "root";
		public static final String senha = "root";
		
		public Connection getConexao() {
			try {
				//Carregar o drive do JDBC do MYSQL
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Estabelecendo conexão com o banco de dados
				conexao = DriverManager.getConnection(URL, usuario, senha);
				System.out.println("CONEXÃO ESTABELECIDA COM SUCESSO!");
			} catch (ClassNotFoundException e) {
				System.out.println("Drive JDBC não encontrado!");
				e.printStackTrace();
			} catch (SQLException e) {
				System.out.println("Erro ao conectar com o Banco!");
				e.printStackTrace();
			}
			return conexao;
		
		}
}
