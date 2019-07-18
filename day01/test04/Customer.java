package test04;

public class Customer {
	public int jisuan(MotoMachine[] cars, int days){
		int money=0;
		for (int i = 0; i < cars.length; i++) {
			money+=cars[i].¼ÆËã×âÁÞ¼Û¸ñ(days);
		}
		return money;
	}
}
