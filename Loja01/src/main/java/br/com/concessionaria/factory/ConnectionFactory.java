package br.com.concessionaria.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection conexao = null;
	public static final String URL = "jdbc:mysql://192.168.5.40:3306/concessionaria";
	public static final String USUARIO  = "root";
	public static final String SENHA = "root";
	
	public Connection getConexao() {
		try {
			//carregar o drive do JDBC do MYSQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Estabelecendo a conexão com o BANCO de DADOS
			conexao = DriverManager.getConnection(URL, USUARIO, SENHA); 
			System.out.println("CONEXÃO ESTABELECIDA COM SUCESSO!");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Drive JDBC não encontrado!");
			e.printStackTrace();
		}catch (SQLException e) {
			System.out.println("Erro ao conectar com o banco!");
			e.printStackTrace();
		}
		
		return conexao;
		
	}//final do método

}//final da class
