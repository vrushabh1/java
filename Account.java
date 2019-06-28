package exception;
import java.util.Scanner;
import java.util.Date;
public class Account extends Exception{
	Scanner sc=new Scanner(System.in);
	public double balance;
	public String name;
	public static int accno=0;
	Date d1=new Date();
	public int acc;
	public double amt;
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAcc() {
		return this.acc;
	}
	public void setAcc(int acc) {
		this.acc = acc;
	}
	public Account()
	{
		this.acc=++accno;
	}
	
	public void deposite()
	{
		System.out.println("\nEnter the Amount you want to deposite: ");
		this.amt=sc.nextDouble();
		this.balance=this.balance+this.amt;
		System.out.println("\n Rs. "+this.amt+" has been deposited successfully in your account number "+this.acc+" !!!");
		System.out.println("\nNow, your current balance is "+this.balance);
	}
	
	public void withdraw()
	{
		System.out.println("\nEnter the Amount you want to withdraw: ");
		this.amt=sc.nextDouble();
		boolean flag=false;
		while(flag==false)
		{
			try {
				if(this.amt>this.balance)
				{
					throw new Exception("\nyour withdrawal amount is greater than current balance!!");
				}
				flag=true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				System.out.println("\nPlease Re-Enter your withdrawal amount: ");
				this.amt=sc.nextDouble();
				
			}
		}
		this.balance=this.balance-this.amt;
		System.out.println("\n Rs. "+this.amt+" has been withdrawn successfully from your account number "+this.acc+" !!!");
		System.out.println("\nNow, your current balance is "+this.balance);
		
	}
	
	public void accept()
	{
		System.out.println("\nEnter the name: ");
		this.name=sc.next();
		System.out.println("\nEnter the initial balance for opening an account: ");
		this.balance=sc.nextDouble();
		boolean flag=false;
		while(flag==false)
		{
		try {
			
			
			if(this.balance<500)
			{
				
				throw new Exception("\nAmount should be greater than 500\n");
				
			}
			flag=true;
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println("\nPlease Re-enter the balance");
			this.balance=sc.nextDouble();
		}
		}
		
	}
	
	public void display()
	{
		System.out.println("\nAccount Number: "+this.acc);
		System.out.println("\nAccount Name: "+this.name);
		System.out.println("\nAccount Balance: "+this.balance);
		System.out.println("\nAccount Creation Date: "+this.d1);
	}
	
}
