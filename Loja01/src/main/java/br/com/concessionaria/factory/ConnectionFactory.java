package br.com.concessionaria.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static Connection conexao = null;
	public static final String URL = "jdbc:mysql://192.168.4228:3306/concessionaria";
	public static final String USUARIO = "root";
	public static final String SENHA = "root";
	
	public Connection getConexao() {
		try {
			//Carregar o drive do JDBC do MYSQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Estabelecer a conexão com o BANCO DE DADOS
			conexao = DriverManager.getConnection(URL,USUARIO,SENHA);
			System.out.println("CONEXÃO ESTABELECIDA COM SUCESSO!");
			
		}catch(ClassNotFoundException e) {
			System.out.println("Drive JDBC não encontrado!");
			e.printStackTrace();
		}catch (SQLException e) {
			System.out.println("Erro ao conectar com o Banco!");
			e.printStackTrace();
		}
		return conexao;
	}
}