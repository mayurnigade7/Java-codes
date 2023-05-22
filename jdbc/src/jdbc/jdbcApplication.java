package jdbc;
import java.nio.channels.ScatteringByteChannel;
import java.sql.*;
import java.util.Scanner;
@SuppressWarnings("unused")
public class jdbcApplication {
	@SuppressWarnings("resource")
	public static void main()
	{
		Scanner sc=new Scanner(System.in);
		int ch=0;
		int studid;
		String fname;
		String Iname;
		ResultSet rs=null;
		Connection con=null;
		PreparedStatement pstate=null;		

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","123456789");
			System.out.println("Connection to DBS");


			do
			{

				System.out.println("1-Insert\n2-Delete\n3-update\n4-Search");
				System.out.println("Enter your choice:");
				ch=sc.nextInt();

				switch(ch)
				{
				case 1:
					System.out.println("Enter Student Id,First Name,Last Name");
					studid=sc.nextInt();
					fname=sc.next();
					Iname=sc.next();
					pstate=con.prepareStatement("Insert into jdbcapp1 values (?,?,?)");
					pstate.setInt(1, studid);
					pstate.setString(2, fname);
					pstate.setString(3, Iname);
					int i=pstate.executeUpdate();
					if(i>0)
					{
						System.out.println("Record inserted....");
					}
					else
					{
						System.out.println("Record Not saved....");
					}
					break;

				}
				System.out.println("Do you want to conti.");
				ch=sc.nextInt();
			}

			while(ch==1);
			{
				System.out.println("Thank you");
			}

		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
