package test;
/**
 * ���˼�ָ����� , 
����30����,��������,Ů�˺�С��. ������һ�ҷ��ݳԷ�,������50����.����ÿ�����˻�3��

��,ÿ��Ů�˻�2����.ÿ��С����1����.��������,Ů��,С��������?

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
