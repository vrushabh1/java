import java.util.Scanner;
public class Date {
	
	private int dd;
	private int mm;
	private int yy;
	Scanner sc1=new Scanner(System.in);
	

	public int getDd() {
		return dd;
	}



	public void setDd(int dd) {
		this.dd = dd;
	}



	public int getMm() {
		return mm;
	}



	public void setMm(int mm) {
		this.mm = mm;
	}



	public int getYy() {
		return yy;
	}



	public void setYy(int yy) {
		this.yy = yy;
	}



	public Date() {
		// TODO Auto-generated constructor stub
	}
	
	public void accept()
	{
		System.out.println("Enter the date: ");
		this.dd=sc1.nextInt();
		System.out.println("/");
		this.mm=sc1.nextInt();
		System.out.println("/");
		this.yy=sc1.nextInt();
		//System.out.println("day: "+sc1.nextInt()+"month: "+sc1.nextInt()+"year: "+sc1.nextInt());
	}
	
	public void display()
	{
		System.out.println("The date is "+this.dd+"/"+this.mm+"/"+this.yy);
	}

}
