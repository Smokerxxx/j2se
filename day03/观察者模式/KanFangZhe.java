package 观察者模式;

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
			System.out.println(name+"看房者发现房子单价发生变化,变为"+((House)o).getDanjia());
			
		}
		
	}

}
