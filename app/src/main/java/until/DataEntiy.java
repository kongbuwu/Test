package until;

import java.io.Serializable;
import java.util.ArrayList;





public class DataEntiy implements Serializable{
	
	private ArrayList<Eninty> list;
	public DataEntiy() {

	}
	
	public ArrayList<Eninty> getList() {
		return list;
	}

	public void setList(ArrayList<Eninty> list) {
		this.list = list;
	}

}
