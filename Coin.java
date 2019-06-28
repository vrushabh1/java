import java.util.Scanner;
public class Coin {

	private String country;
	private String Denomination;
	private Date yom=new Date(); 
	private double Current_value;
	private Date Acquired_date=new Date();
	Scanner sc1=new Scanner(System.in);
	
	public Coin(String country,String Denomination,Date yom,double Current_value,Date Acquired_date) 
	{
		this.country=country;
		this.Denomination=Denomination;
		this.yom=yom;
		this.Current_value=Current_value;
		this.Acquired_date=Acquired_date;
	}
	
	public Coin()
	{
		System.out.println("Enter the Country name ");
		this.country=sc1.next();
		System.out.println("Enter the Denomination ");
		this.Denomination=sc1.next();
		System.out.println("Enter the year of minting ");
		yom.accept();
		System.out.println("Enter the Current value");
		this.Current_value=sc1.nextDouble();
		System.out.println("Enter the year of Acquiring the coin ");
		Acquired_date.accept();
	}
	
	public void display()
	{
		System.out.println("the Country name: "+this.country);
		System.out.println("Denomination: "+this.Denomination);
		System.out.println("Enter the year of minting: ");
		yom.display();
		System.out.println("Current value: "+this.Current_value);
		System.out.println("year of Acquiring the coin: ");
		Acquired_date.display();
	}

}
