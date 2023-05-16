package test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class DbConnection {

	String url = "jdbc:postgresql://localhost:5432/";
	String dbName = "esercizioG1W3";
	String user = "postgres";
	String pass = "root";
	Connection conn;
	Statement st;
	
	public DbConnection() throws SQLException {
		conn = DriverManager.getConnection(url+dbName,user,pass);
		st = conn.createStatement();
	}
	
	public void InserisciCliente (Cliente c) throws SQLException {
		String sql = "INSERT INTO clienti(nome, cognome, data_nascita, regione_residenza ) "
				+ "VALUES ('"+c.getNome()+"', '"+c.getCognome()+"', '"+c.getData_nascita()+"', '"+c.getRegione_residenza()+"')";
		st.executeUpdate(sql);
	}
	
	public void modificaCliente(Cliente c) throws SQLException {
		String sql = "UPDATE clienti SET "
				+ "nome = '"+c.getNome()+"', "
				+ "cognome = '"+c.getCognome()+"', "
				+ "data_nascita = '"+c.getData_nascita()+"', "
				+ "regione_residenza = '"+c.getRegione_residenza()+"' "
				+ "WHERE numero_cliente = " + c.getNumero_cliente();
		st.executeUpdate(sql);
		System.out.println( c.getNome() + " " + c.getCognome() + " modificato nel DB!!");
	}
	
	public void cancellaCliente(Cliente c) throws SQLException {
		String sql = "DELETE FROM clienti WHERE numero_cliente = " + c.getNumero_cliente();
		st.executeUpdate(sql);
		System.out.println( c.getNome() + " " + c.getCognome() + " eliminato nel DB!!");
	}
}
