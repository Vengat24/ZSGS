package Inheritance_DAY10;

import java.util.ArrayList;
import java.util.List;

/*4. Create classes for the given class diagram - 
 * https://www.geeksforgeeks.org/class-diagram-for-library-management-system/*/
 class Library{
	 String UserType;
	 String UserName;
	 String Passowrd;
	 void logIn() {}
	 void register() {}
	 void logOut() {}
 }
 class User extends Library{
	 int id;
	 void verify() {}
	 void checkAccount() {}
	 void get_book_info() {}

 }
 class Account extends User{
	 int borrowedBooks;
	 int reservedBooks;
	 int returnedBooks;
	 int lostBooks;
	 int fineAmount;
	 void calculate_Fine() {}
 }
 class Book extends Library{
	 String Title;
	 String Author;
	 String ISBN;
	 String Publication;
	 void showDuedt() {}
	 void reservation_Status() {}
	 void feedback() {}
	 void book_Request() {}
	 void rnew_Info() {}	 
 }
 class Librarian extends Library{
	 int Id;
	 String SearchString;
	 void verify_Librarian() {}
	 void search() {}
 }
 class database{
	 List<Book> books = new ArrayList<>();
	 void add(){}
	 void delete(){}
	 void update(){}
	 void display(){}
	 void search(){}
 }

public class fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book();
		b.getClass();

	}

}
