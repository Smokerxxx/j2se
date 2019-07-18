package test;
/**
 * 马克思手稿问题 , 
共有30个人,包括男人,女人和小孩. 他们在一家饭馆吃饭,共花了50先令.其中每个男人花3先

令,每个女人花2先令.每个小孩花1先令.请问男人,女人,小孩各几人?

3x+2y+z=50;
x+y+z=30;

2x+y=20;
y=20-2x;



 * @author Administrator
 *
 */
public class Test2 {

	public static void main(String[] args) {
		int men=0;
		int women=0;
		int children=0;
		
		for (;men<=10;men++) {
			women=20-2*men;
			children = 30-men-women;
			if (3*men+2*women+children==50) {
				System.out.println( "men:"+men+",women:"+women+",children:"+children);
			}
		}

	}

}
