package �۲���ģʽ1;

public class test{
	public static void main(String[] args) {
		House house = new House("LONGTENG",10000);
		
		KandeREN ren1 = new KandeREN("����");
		KandeREN ren2 = new KandeREN("����");
		
		house.addObserver(ren1);
		house.addObserver(ren2);

		
		
		house.setDanjia(50000);
		System.out.println();
		
		house.deleteObserver(ren1);
		house.setDanjia(52000);
	}
}