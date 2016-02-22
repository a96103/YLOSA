package ylosa.Vo;

import java.beans.PropertyDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ApplicationProperty<T> implements Vo{

	final String PROPERTY_FILE = "application.properties";
	private Properties prop;
	private InputStream inputStream;
	private Vo vo;
	public ApplicationProperty() throws IOException{
		this.init();
	}
	
	
	private void init() throws IOException{
		try{
			inputStream = getClass().getClassLoader().getResourceAsStream(PROPERTY_FILE);
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + PROPERTY_FILE + "' not found in the classpath");
			}
		} catch (IOException e){
			e.printStackTrace();
			throw e;
		} finally{
			inputStream.close();
		}
	}

	public T setProperty(T object){
		
//		Method[] m = object.getClass().getMethods();
//		PropertyDescriptor pd = new PropertyDescriptor(object,object.getClass());
//		
//	
	return object;
	}
	
	
	public Vo getVo() {
		return vo;
	}


	public void setVo(Vo vo) {
		this.vo = vo;
	}
	
	

	
	
	
	
	
	
}
