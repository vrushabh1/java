
package exception;

import java.util.Scanner;

public class throw_ex extends Exception{
	Scanner sc=new Scanner(System.in);
	double balance;
	public throw_ex()
	{
		
	}
	public void withdraw() throws Myexception
	{
		System.out.println("Enter the amount");
		this.balance=sc.nextDouble();
		if(this.balance<500)
		{
			throw new Myexception("Insufficient Balance");
		}
		
	}
	public void display() {
		// TODO Auto-generated method stub
		
	}
}
