package test04;

public abstract class MotoMachine {
	private String no;//���ƺ�

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
	
	public abstract int �������޼۸�(int days);
}
