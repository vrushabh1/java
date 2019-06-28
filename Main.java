import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;
public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		Set<Coin> coinhash=new HashSet();
		System.out.println("How many coins you wanted to add");
		int c=sc1.nextInt();
		for(int i=0;i<c;i++)
		{
			coinhash.add(new Coin());
			
		}
		
		/*for(int j=0;j<coinhash.size();j++)
		{
			System.out.println(coinhash.get(j));
			
		}*/
		Iterator iter=(Iterator) coinhash.iterator();
		while(((java.util.Iterator<String>) iter).hasNext())
		{
			Coin ref=iter.next();
			ref.display();
		}
		

	}

}
