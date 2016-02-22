package ylosa.Util;

import java.io.IOException;
import java.sql.Connection;

public class DBUtils implements UtilsInterface{
	private Connection c;
	private String databaseIP;
	private String databaseUser;
	
	
	protected DBUtils() {
//		try{
////
////			databaseIP = pu.getProperty("database.ip");
////			databaseUser = pu.getProperty("database.user");
////			databasePassword = pu.getProperty("database.password");
////			pu.getProperty("database.JDBCDriver");
//		} catch(IOException e){
//			
//		}
	}
	
//	public static Boolean testDB(){
//		
//	}
//	
//	public Connection getConnection() {
//		
//	}
//	
//	public void release(){
//		c.close();
//	}

	public DBUtils getInstance() {
		return new DBUtils();
	}
	
	public void close() throws Exception{
		if(!c.isClosed()){
			c.close();
		}
	}
	
}
