package esercizio3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class MainProject {
	
	static File file = new File ("registro/presenze.txt");
	
	public static void main(String[] args) {

		
	}

	public static void scriviPresenza(String s, String r) throws IOException {
		FileUtils.writeStringToFile(file, s, r, "UTF-8", true);
	}
	
	public static void leggiRegistro() throws IOException {
		FileUtils.readFileToString(file, "UTF-8");
	}
}
