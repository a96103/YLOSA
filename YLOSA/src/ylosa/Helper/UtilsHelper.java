package ylosa.Helper;

import ylosa.Util.DBUtils;

public class UtilsHelper extends DBUtils implements Helper{
	
	public UtilsHelper(){
		super();
	}
	@Override
	public UtilsHelper getInstance() {
		return new UtilsHelper();
	}

}
