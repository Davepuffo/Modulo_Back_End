package esercizio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class DbConnection {

	String url = "jdbc:postgresql://localhost:5432/";
	String dbName = "eserciziow3g1_2";
	String user = "postgres";
	String pass = "root";
	Connection conn;
	Statement st;
	
	
	public DbConnection() throws SQLException {
		conn = DriverManager.getConnection(url+dbName,user,pass);
		st = conn.createStatement();
	}
	
	public void insertStudent (Studente s) throws SQLException {
		String sql = "INSERT INTO school_students (name, lastname, gender, birthdate, avg, min_vote, max_vote) "
				+ "VALUES ('"+s.getName()+"','"+s.getLastname()+"','"+s.getGender()+"','"+s.getBirthdate()+"','"+s.getAvg()+"','"+s.getMinVote()+"','"+s.getMaxVote()+"')";
		st.executeUpdate(sql);
		System.out.println("Salvato!");
	}
	
	/*public void modificaCliente(Cliente c) throws SQLException {
	String sql = "UPDATE clienti SET "
			+ "nome = '"+c.getNome()+"', "
			+ "cognome = '"+c.getCognome()+"', "
			+ "data_nascita = '"+c.getData_nascita()+"', "
			+ "regione_residenza = '"+c.getRegione_residenza()+"' "
			+ "WHERE numero_cliente = " + c.getNumero_cliente();
	st.executeUpdate(sql);
	System.out.println( c.getNome() + " " + c.getCognome() + " modificato nel DB!!");
}
*/
	
	public void updateStudent(Studente s) throws SQLException {
		String sql = "UPDATE school_students SET "
				+ "name = '"+s.getName()+"', "
				+ "lastname = '"+s.getLastname()+"', "
				+ "gender = '"+s.getGender()+"', "
				+ "birthdate = '"+s.getBirthdate()+"' "
				+ "avg = '"+s.getAvg()+"' "
				+ "min_vote = '"+s.getMinVote()+"' "
				+ "max_vote = '"+s.getMaxVote()+"' "
				+ "WHERE id = " + s.getId();
		st.executeUpdate(sql);
		System.out.println( s.getName() + " " + s.getLastname() + " modificato nel DB!!");
	}
	
	public void cancellaCliente(Studente s) throws SQLException {
		String sql = "DELETE FROM school_students WHERE id = " + s.getId();
		st.executeUpdate(sql);
		System.out.println( s.getName() + " " + s.getLastname() + " eliminato nel DB!!");
	}
	
	public void getBest() throws SQLException {
		String sql = "SELECT * FROM school_students EXTRACT(MAX avg AS Migliore) ";
		st.executeUpdate(sql);
		System.out.println("Migliore della classe");
	}
	
	public void getVoteRange(int min, int max) throws SQLException {
		String sql = "SELECT * FROM school_students EXTRACT(MAX avg AS Migliore) ";
		st.executeUpdate(sql);
		System.out.println("Migliore della classe");
	}
}
