package bookshelf;

public class Book {
	String title;
	String author;
	String genre;
	int pageCount;
	
	public Book(String title, String author, String genre, int pageCount) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.pageCount = pageCount;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	
	
}
