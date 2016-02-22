package ylosa.Helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ylosa.Util.DBUtils;

public class PreparedStatementHelper implements Helper{
	private PreparedStatement p;
	private Connection c;
	private String strBuffer;
	private int strBufferIndex = 0;
	private PreparedStatementHelper(){
		
	}
	private void init(){
		//DBUtils dbu = DBUtils.getInstance();
		
	}
	
	
	public PreparedStatementHelper getInstance(){
		return new PreparedStatementHelper();
	}
	
	public void setInt(Integer i) throws SQLException{
		p.setInt(strBufferIndex++, i);
	}
	
	public void setString(String s) throws SQLException {
		p.setString(strBufferIndex++, s);
	}
	
	public void setDouble(Double d) throws SQLException {
		p.setDouble(strBufferIndex++, d);
	}
	
	public String toString(){
		return strBuffer;
	}
	
	public void close() throws Exception{
		if(!p.isClosed()) {
			p.close();
		}
	}
}
