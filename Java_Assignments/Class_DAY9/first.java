package Class_DAY9;

import java.util.ArrayList;
import java.util.List;

/*1. Create Book DTO class with attributes like title, 
 * ISBN etc. Create appropriate instance variables,
 *  static variables and methods with appropriate access 
 *  modifiers.*/

class Book{
	private String title;
	private int ISBN;
	private String author;
	private float price;
	Book(String title,String author,int ISBN,float price) {
		this.author = author;
		this.title = title;
		this.ISBN = ISBN;
		this.price = price;
	}
	
	public void getBook() {
		System.out.println("Title : "+title);
		System.out.println("ISBN : "+ISBN);
		System.out.println("Author : "+author);
		System.out.println("Price : "+price);
		System.out.println();
	}
	
}

public class first {

	public static void main(String[] args) {
	List<Book> list = new ArrayList<Book>();
	list.add(new Book("Java", "Vengat", 12, 734.5f));
	list.add(new Book("C++", "Vengatesh", 7, 353.5f));
	list.add(new Book("Python", "Venkat", 10, 986.5f));
	
	for(Book b : list) {
		b.getBook();
	}
	}

}
