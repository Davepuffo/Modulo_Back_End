package test;

import java.sql.SQLException;
import java.time.LocalDate;

public class MainProject {

	public static void main(String[] args) {
		
		try {
			DbConnection db = new DbConnection();
			// Cliente c = new Cliente("Marco", "Viola", LocalDate.of(1993, 10, 11), "Lazio");
			
			//Cliente c = db.leggiCliente(3);
			//System.out.println(c);
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}

}
