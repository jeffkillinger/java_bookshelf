package bookshelf;

public class Bookshelf {

	public static void main(String[] args) {		
		Book[] bookshelf = new Book[25];
		
		for (int i = 0; i < bookshelf.length; i++) {
			bookshelf[i] = new Book("", "", "", 0);
		}
		
		bookshelf[0] = new Book("Oh the Glory of it All", "Sean Wilsey", "Memoir", 484);
		
		bookshelf[2].author = "George Saunders";
		
		System.out.println(bookshelf[2].getAuthor());
		
		System.out.println(bookshelf[0].getAuthor());

	}
	
	
	
	public static void add() {}
	
	public static void remove() {}
	
	public static void search() {}
	
	public static void recommend() {}
	
	

}

