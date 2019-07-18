package showtime;

public class test {
	public static void main(String[] args) {
		show show = new show();
		Thread o = new Thread(show);
		
		o.run();
	}
}
