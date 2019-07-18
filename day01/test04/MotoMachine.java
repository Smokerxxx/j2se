package test04;

public abstract class MotoMachine {
	private String no;//车牌号

	public MotoMachine(String no) {
		super();
		this.no = no;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}
	
	public abstract int 计算租赁价格(int days);
}
