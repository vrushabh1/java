package exception;

import java.util.Scanner;

public class ex {
	Scanner sc=new Scanner(System.in);
	int num;
	public ex()
	{
		
	}
	
	public void display() throws Exception
	{
		System.out.println("Enter the number");
		this.num=sc.nextInt();
		if(this.num>500)
		{
			throw new Exception("Number is Invalid!!");
		}
	}
}
