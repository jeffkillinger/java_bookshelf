package bookshelf;

//import java.io.BufferedReader;

import java.nio.file;
import java.nio.charset.Charset;
import java.nio.file.Files;

public class Bookshelf {

	Charset charset = Charset.forName("US-ASCII");
	try (BufferedReader reader = Files.newBufferedReader(file, charset)){
		String line = null;
		while ((line = reader.readline()) != null) {
			System.out.println(line);
		}
	} catch (IOException x) {
		System.err.format("IOException: %s%n, x);
	}
	
	
	
	
	
	public static void main(String[] args) {
	

	}
	
	
	
	public static void add() {}
	
	public static void remove() {}
	
	public static void search() {}
	
	public static void recommend() {}
	
	

}




//public class BufferedReader extends Reader {}