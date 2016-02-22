package ylosa.Vo;

import java.io.IOException;

public class DatabaseProperty extends ApplicationProperty {

	private String ip;
	private String sqlDriver;

	private DatabaseProperty() throws IOException{
		super();
	}
	
	
	public static DatabaseProperty getInstance() throws Exception{
		try{
			return new DatabaseProperty();
		} catch (Exception e){
			e.printStackTrace();
			return null;
		} 
	}

}
