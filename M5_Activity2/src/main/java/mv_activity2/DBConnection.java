package mv_activity2;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL = "jdbc:postgresql://localhost:5432/training_db";
    private static final String USER = "nftorrero";
    private static final String PASSWORD = "";
    
    public static void main(String[] args) {
    	
    	try	{
    		
    		Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected successfully");
    		
    	} catch (Exception e) {
    		
    		System.out.println("Connection failed");
    		e.printStackTrace(); 
    	}
    	
    }
}
