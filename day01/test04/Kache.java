package test04;

public class Kache  extends MotoMachine{

	
	public Kache(String no, int dunwei) {
		super(no);
		this.dunwei = dunwei;
	}


	private int dunwei;
	

	@Override
	public int ¼ÆËã×âÁŞ¼Û¸ñ(int days) {
		int money=0;
		if (dunwei<20) {
			money=2000*days;
		}else{
			money=3000*days;
		}
		return money;
	}
	
	
}
