package Abstract_DAY11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*4. Create 'Document' abstract class. Create subclasses
 *  like PDFDocument, TextDocument, ImageDocument, etc. 
 *  Create abstract methods and concrete methods and 
 *  demonstrate how they work.*/

abstract class Document{
	String Author;
	int Size;
	Scanner obj =  new Scanner(System.in);
	Document(){
		System.out.print("Enter your Name : ");
		Author = obj.next();
		System.out.print("Enter Required Document Size : ");
		Size = obj.nextInt();
	}
	
	abstract void documentType();
	
	void display() {
		System.out.println("  Author : "+Author);
		System.out.println("  Size : "+ Size);
	}
}
class PDFDocument extends Document{
	void documentType() {
		System.out.println("  PDF Document : ");
	}
}
class TextDocument extends Document{
	void documentType() {
		System.out.println("  Text Document : ");
	}
}
class ImageDocument extends Document{
	void documentType() {
		System.out.println("  Image Document : ");
	}
}
class VideoDocument extends Document{
	void documentType() {
		System.out.println("  Video Document : ");
	}
}
public class fourth {
	public static void main(String[]args) {
		Scanner obj = new Scanner(System.in);
		int ch = 1;
		List<Document> docs = new ArrayList<>();
		while(ch == 1 || ch == 2) {
			System.out.println("----------------------------------------------");
			System.out.println("1.Create Document   2.View Document   3.Exit");
			System.out.println("----------------------------------------------");
			System.out.print("Enter Your Choice : ");
			ch = obj.nextInt();
			
			if(ch == 1) {
				create(docs);
			}else if(ch ==2) {
				display(docs);
			}else {
				System.out.println("Thank You!");
				break;
			}
		}
		
	}
	public static void create(List<Document> docs) {
		Scanner obj = new Scanner(System.in);
		int ch = 1;
		while(ch == 1|| ch == 2|| ch == 3|| ch ==4) {
			System.out.println("---------------------");
			System.out.println(" 1)PDF Documnet \n 2)Text Document \n 3)Image Documnet \n 4)Video Document \n 5)Exit");
			System.out.println("---------------------");
			System.out.print("Please Select Document Type : ");
			ch = obj.nextInt();
			System.out.println("---------------------");
			if(ch == 1) {
				System.out.println("Enter PDF Document Details : ");
				docs.add(new PDFDocument());
			}else if(ch == 2) {
				System.out.println("Enter Text Document Details : ");
				docs.add(new TextDocument());
			}else if(ch == 3) {
				System.out.println("Enter Image Document Details : ");
				docs.add(new ImageDocument());
			}else if(ch == 4) {
				System.out.println("Enter Video Document Details : ");
				docs.add(new VideoDocument());
			}else {
				return;
			}
			
		}
		
	}
	
	public static void display(List<Document> docs) {
		if(docs.size() == 0) {
			System.out.println("Oops!..Document Is Not Created !");
		}else {
			System.out.println("Documents Available : ");
			for(Document doc : docs){
				System.out.println("---------------------");
				doc.documentType();
				doc.display();
				System.out.println("---------------------");
			}
		}
	}
	
}
