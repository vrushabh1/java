package exception;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		ex tx=new ex();
		/*boolean flag=false;
		while(flag==false)
		{
		try {
			tx.withdraw();
			flag=true;
		}
		
		catch (Myexception me) {
			// TODO Auto-generated catch block
			System.out.println(me.getStr());
			
		}
		}
		System.out.println("Your amount has been withdrawn!!");*/
		boolean flag=false;
		while(flag==false)
		{
		try {
			tx.display();
			flag=true;
		} catch (Exception me) {
			// TODO Auto-generated catch block
			System.out.println(me.getMessage());
		}
		}
		System.out.println("Your amount has been withdrawn!!");
	
	}
}
