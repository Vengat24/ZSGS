package Abstract_DAY11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Product{
	int price;
	String Type;
	abstract int getPrice();
	abstract String getDescription();
}
abstract class ElectronicsProduct extends Product{
	ElectronicsProduct(){
		System.out.println("Product Name : "+getDescription());
		System.out.println("Price : " + getPrice());
	}
}
abstract class ClothingProduct  extends Product{
	ClothingProduct(){
		System.out.println("Product Name : "+getDescription());
		System.out.println("Price : " + getPrice());
	}
}
abstract class BookProduct  extends Product{
	BookProduct(){
		System.out.println("Product Name : "+getDescription());
		System.out.println("Price : " + getPrice());
	}
}
class Television extends ElectronicsProduct{
	int getPrice() {
		return 10000;
	}
	String getDescription() {
		return "Television";
	}	
}
class Mobile extends ElectronicsProduct{
	int getPrice() {
		return 18000;
	}
	String getDescription() {
		return "Mobile";
	}	
}
class Laptop extends ElectronicsProduct{
	int getPrice() {
		return 56000;
	}
	String getDescription() {
		return "Laptop";
	}	
}




class Shirt extends ClothingProduct{
	int getPrice() {
		return 2000;
	}
	String getDescription() {
		return "Shirt";
	}	
}
class Pant extends ClothingProduct{
	int getPrice() {
		return 1500;
	}
	String getDescription() {
		return "Pant";
	}	
}
class TShirt extends ClothingProduct{
	int getPrice() {
		return 1000;
	}
	String getDescription() {
		return "TShirt";
	}	
}


class Java extends BookProduct{
	int getPrice() {
		return 3000;
	}
	String getDescription() {
		return "Java";
	}	
}
class Python extends BookProduct{
	int getPrice() {
		return 2400;
	}
	String getDescription() {
		return "Python";
	}	
}class JavaScript extends BookProduct{
	int getPrice() {
		return 2200;
	}
	String getDescription() {
		return "JavaScript";
	}	
}
public class second {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		List<Product> cart = new ArrayList<>();
		int ch = 1;
		System.out.println("Welcome to Console Shopping");
		while(ch == 1 || ch == 2 || ch == 3) {
			System.out.println("-----------------------");
			System.out.println("1) Electronic Product");
			System.out.println("2) Clothing Product");
			System.out.println("3) Book Product");
			System.out.println("4) Exit");
			System.out.println("-----------------------");
			System.out.print("Choose the Product : ");
			int prod = obj.nextInt();
			if(prod == 4) {
				break;
			}
			shopingCart(prod,cart);
		}
		System.out.println("--------------------------------");
		System.out.println("Shopping Cart : ");
		int total=0;
		for(Product each : cart) {
			System.out.println(each.getDescription() +" : "+each.getPrice());
			total += each.getPrice();
		}
		System.out.println("--------------------------------");
		System.out.println("Total Amount : " + total);
		System.out.println("--------------------------------");
		
	}
	public static void shopingCart(int prod, List<Product> cart)  {
		Scanner obj = new Scanner(System.in);
		if(prod == 1) {
			int buy = 1;
			while(buy == 1 || buy == 2 || buy == 3) {
				System.out.println("--------------------------------------");
				ElectronicsProduct e1 = new Television();
				ElectronicsProduct e2 = new Mobile();
				ElectronicsProduct e3 = new Laptop();
				System.out.println("Enter 0 to Go Back ");
				System.out.println("--------------------------------------");
				System.out.print("Enter Electronic Product Number ");
				buy = obj.nextInt();
				if(buy == 1) {
					cart.add(e1);
				}else if(buy == 2) {
					cart.add(e2);
				}else if(buy == 3) {
					cart.add(e3);
				}else {
					break;
				}
			}
			
			
			
			
			
		}else if(prod == 2) {
			int buy = 1;
			while(buy == 1 || buy == 2 || buy == 3) {
				System.out.println("--------------------------------------");
				ClothingProduct c1 = new Shirt();
				ClothingProduct c2 = new Pant();
				ClothingProduct c3 = new TShirt();
				System.out.println("Enter 0 to Go Back ");
				System.out.println("--------------------------------------");
				System.out.print("Enter Electronic Product Number ");
				buy = obj.nextInt();
				if(buy == 1) {
					cart.add(c1);
				}else if(buy == 2) {
					cart.add(c2);
				}else if(buy == 3) {
					cart.add(c3);
				}else {
					break;
				}
			}
			
		}else if(prod == 3) {
			int buy = 1;
			while(buy == 1 || buy == 2 || buy == 3) {
				System.out.println("--------------------------------------");
				BookProduct b1 = new Java();
				BookProduct b2 = new Python();
				BookProduct b3 = new JavaScript();
				System.out.println("Enter 0 to Go Back ");
				System.out.println("--------------------------------------");
				System.out.print("Enter Electronic Product Number ");
				buy = obj.nextInt();
				if(buy == 1) {
					cart.add(b1);
				}else if(buy == 2) {
					cart.add(b2);
				}else if(buy == 3) {
					cart.add(b3);
				}else {
					break;
				}
			}
		}
		
		
		
	}

}
