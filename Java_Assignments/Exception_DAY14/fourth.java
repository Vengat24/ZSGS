package Exception_DAY14;

import java.util.Scanner;

class Bank{
	private int Balance;
	Bank(int val){
		Balance = val;
	}
	public int getBalance(){
		return Balance;
	}
	public void setBalance(int val){
		Balance += val;
	}
	public void withdraw(int val) throws InsufficientBalanceException{
		if(Balance - val <0) {
			throw new InsufficientBalanceException();
		}else {
			setBalance(-val);
			System.out.println("Successfully Money Debited");
		}
	}
	
}
class InsufficientBalanceException extends Exception {
	InsufficientBalanceException(){
		System.out.println("InsufficientBalanceException");
	}
}

public class fourth {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		Bank b = new Bank(1000);
		System.out.println("1)Deposit Money");
		System.out.println("2)Withdraw Money ");
		System.out.print("Enter Your Choice : ");
		int ch = obj.nextInt();
		if(ch == 1) {
			b.setBalance(obj.nextInt());			
		}else if(ch == 2) {
			try {
				System.out.print("Enter The Amount : ");
				b.withdraw(obj.nextInt());
			}catch(InsufficientBalanceException e) {
				
			}
		}else {
			System.out.println("Invalid Choice");
		}
		
	}

}
