package �۲���ģʽ1;

import java.util.Observable;
import java.util.Observer;

public class KandeREN implements Observer{
	public KandeREN(String name) {
		this.name = name;
	}
	
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof House) {
			System.out.println("��������"+name+"���ֵ��۱仯wei"+((House)o).getDanjia());
		}
	}

}
