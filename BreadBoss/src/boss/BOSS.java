package boss;


import java.io.IOException;


//this is where we run the system itself
public class BOSS {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		


		
		Store boss = new Store();
		
		try
		{
			boss.connectDB();
			boss.loadData();
			boss.welcome(); 
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Input-Output Exception, Program Terminated!");
			System.exit(1000);
			
		}
		
	
	
	}
}
