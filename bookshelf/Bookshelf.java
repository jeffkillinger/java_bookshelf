package bookshelf;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Bookshelf {



	public static void main(String[] args) throws FileNotFoundException {
		Scanner scnr = new Scanner(new File("/Users/jeff/Desktop/books.csv"));
		scnr.useDelimiter(",");
		while(scnr.hasNext()) {
			System.out.print(scnr.next() + "|");
		}
		scnr.close();
	}
	
	
	
	public static void add() {}
	
	public static void remove() {}
	
	public static void search() {}
	
	public static void recommend() {}
	
	

}

