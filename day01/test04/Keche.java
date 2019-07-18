package test04;

public class Keche extends MotoMachine{
	
	
	public Keche(String no,int zuoweishu) {
		super(no);
		this.zuoweishu = zuoweishu;
	}

	private int zuoweishu;

	public int getZuoweishu() {
		return zuoweishu;
	}

	public void setZuoweishu(int zuoweishu) {
		this.zuoweishu = zuoweishu;
	}

	@Override
	public int ¼ÆËã×âÁÞ¼Û¸ñ(int days) {
		int money=0;
		if (zuoweishu<16) {
			money=1000*days;
		}else{
			money=1500*days;
		}
		return money;
	}
	
}
