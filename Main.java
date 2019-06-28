package exception;
import java.rmi.server.SocketSecurityException;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Account[] a=new Account[50];
		
		int cnt = 0;
		int cnt1=2;
		String wish;
		do
		{
		System.out.println("\n---------MENU-------");
		System.out.println("\n1.add\n2.close\n3.deposite\n4.withdraw\n5.display all account");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			do
			{
				a[cnt]=new Account();
				
				a[cnt].accept();
				a[cnt].display();
				cnt++;
				System.out.println("\nDo you want to add more[YES/NO]: ");
				wish=sc.next();
			}while(wish.equals("yes") || wish.equals("YES"));
			break;
		case 2:
			
			do
			{
				System.out.println("\nPlease Enter your Account Number that you want close: ");
				int acc=sc.nextInt();
				boolean flag=false;
				while(flag==false)
				{
			try {
				for(int i=0;i<=cnt;i++)
				{
					if (cnt1==0)
					{
						/*if(a[i].getAcc()==acc)
						{
							a[i]=null;
							System.out.println("\nNow, your account number "+acc+" has been closed successfully!!");
							flag=true;
							cnt1=2;
							break;
						}
						else
						{*/
						System.out.println("\n\nMr.Zandu!!You exceeds your limit\n");
						flag=true;
						cnt1=2;
						break;
						
					}
					else if(a[i].getAcc()==acc)
					{
						a[i]=null;
						System.out.println("\nNow, your account number "+acc+" has been closed successfully!!");
						flag=true;
						cnt1=2;
						break;
					}
					
					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
					
					System.out.println("\nYour account number invalid!!");
					System.out.println("\nYou only have "+cnt1+" chance left!!");
					--cnt1;
					System.out.println("\nPlease Enter valid account number");
					int acc1=sc.nextInt();
					
			}
			
				
			}
			System.out.println("\nDO want to close more account[yes/no]: ");
			wish=sc.next();
			}while(wish.equals("yes") || wish.equals("YES"));
			break;
			
		case 3:
			do
			{
				System.out.println("\nPlease Enter your Account Number that you want deposite: ");
				int acc=sc.nextInt();
				boolean flag=false;
				while(flag==false)
				{
			try {
				for(int i=0;i<=cnt;i++)
				{
					if(a[i].getAcc()==acc)
					{
						a[i].deposite();
						flag=true;
						break;
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("\nYour account number invalid!!");
				System.out.println("\nPlease Enter valid account number");
				int acc1=sc.nextInt();
			}
			
				
			}
			System.out.println("\nDO want to deposite more [yes/no]: ");
			wish=sc.next();
			}while(wish.equals("yes") || wish.equals("YES"));
			break;
			
		case 4:
			do
			{
				System.out.println("\nPlease Enter your Account Number that you want withdraw: ");
				int acc=sc.nextInt();
				boolean flag=false;
				while(flag==false)
				{
			try {
				for(int i=0;i<=cnt;i++)
				{
					if(a[i].getAcc()==acc)
					{
						a[i].withdraw();
						flag=true;
						break;
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("\nYour account number invalid!!");
				System.out.println("\nPlease Enter valid account number");
				int acc1=sc.nextInt();
			}
			
				
			}
			System.out.println("\nDO want to Withdraw more [yes/no]: ");
			wish=sc.next();
			}while(wish.equals("yes") || wish.equals("YES"));
			break;
			
		case 5:
			System.out.println("\n\nAll Account Summary ----");
			
					for(int i=0;i<=cnt;i++)
					{
						if(a[i]==null)
						{
							System.out.println("");
						}
						else
						{
							a[i].display();
							System.out.println("");
						}
					}
			
			
		}
		System.out.println("\nDo you want to perform more operation[yes/no]: ");
		wish=sc.next();
		}while(wish.equals("yes") || wish.equals("YES"));
		
	}
	
}
