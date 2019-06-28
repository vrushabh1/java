package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;






public class DataBaseConnectivity {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		student s=new student();
		int ch;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ven1","root","root");
			Statement stm=con.createStatement();
			
			//--------------------------------------------------------------------------------
			do
			{
			System.out.println("----database operation----------");
			System.out.println("1.select the data from table");
			System.out.println("2.insert from table");
			System.out.println("3.delete data into table");
			System.out.println("4.update the data");
			System.out.println("enter the choice");
			 ch=sc.nextInt();
			
			switch(ch)
			{
			//-----------------------------------------------------------------------
			case 1:
				ResultSet rs=stm.executeQuery("select * from stud");
			
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getInt(3));
				}
				break;
			//----------------------------------------------------------------------------------
			case 2:
				s.accept();
				String query="insert into stud(id,name) values(?,?)";
				PreparedStatement ps=con.prepareStatement(query);
				
				ps.setInt(1,s.getId());
				ps.setString(2,s.getName());
				
				int cnt=ps.executeUpdate();
				
				System.out.println("data inserted into table");
				break;
				//------------------------------------------------------------------------
			case 3:
				System.out.println("enter the id");
				int id=sc.nextInt();
				String query2="delete from stud where id=?";
				PreparedStatement ps1=con.prepareStatement(query2);
				ps1.setInt(1,id);
				int cnt1=ps1.executeUpdate();
				
				System.out.println("data deleted into table");
				
				break;
				//-------------------------------------------------------------------------
			case 4:
				
				System.out.println("enter the id");
				int id1=sc.nextInt();
				System.out.println("enter the name");
				String name=sc.next();
				
				System.out.println("enter the age");
				int age=sc.nextInt();
				
				String query3="update stud set name=?,age=? where id=?";
				PreparedStatement ps3=con.prepareStatement(query3);
				ps3.setString(1,name);
				ps3.setInt(2,age);
		
				ps3.setInt(3,id1);
				
			ps3.executeUpdate();
				
			}
			}while(ch!=5);
				con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		} 
	}


