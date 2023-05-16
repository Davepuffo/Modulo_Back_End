package esercizio;

import java.sql.SQLException;
import java.time.LocalDate;

public class MainProject {

	public static void main(String[] args) {

		try {
			DbConnection db = new DbConnection();
			Studente s = new Studente("Giacomo", "Rossi", "m", LocalDate.of(1992, 2, 4), 5, 8, 3);
			db.insertStudent(s);
			db.getBest();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
