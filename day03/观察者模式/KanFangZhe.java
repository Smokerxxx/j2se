package �۲���ģʽ;

import java.util.Observable;
import java.util.Observer;

public class KanFangZhe implements Observer {
	private String name;
		
	public KanFangZhe(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof House) {
			System.out.println(name+"�����߷��ַ��ӵ��۷����仯,��Ϊ"+((House)o).getDanjia());
			
		}
		
	}

}
