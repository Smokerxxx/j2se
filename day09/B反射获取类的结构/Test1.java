package B�����ȡ��Ľṹ;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test1 {

	public static void main(String[] args) {
		
		try {
			Class<?> c = Class.forName("B�����ȡ��Ľṹ.Person");
			
			//��ȡĳ����Ľӿڷ���  ,����һ��Class<?>[]  ������ʽ , ��Ϊ��ʵ��,������Ҫ����, ����Ϊ�ӿ����������,������Class��
			Class<?>[] interfaces = c.getInterfaces();//��ȡ�������еĽӿ�
			
			for (Class<?> f : interfaces) {
				System.out.println("�ӿ�:"+f.getName());
			}
			
			//����һ��Class<?>��   ,��Ϊjava�ǵ��̳�  , ���û����ʾ�ļ̳�ĳ����,���඼��Object��
			Class<?> superclass = c.getSuperclass();
			System.out.println("����:"+superclass.getName());
			
			//���ع��췽��������  , �ǹ�����������
			Constructor<?>[] constructors = c.getConstructors();
			
			//ѭ������������  ,�鿴���������еĸ��ַ���
			System.out.println("չʾ���췽��:");
			for (Constructor<?> cons : constructors) {
				Class<?>[] parameterTypes = cons.getParameterTypes();//�õ���������ȫ������
				
				
				System.out.print(Modifier.toString(cons.getModifiers()));//�õ�����Ȩ��   public  private
				System.out.print(cons.getName()+"(");//��������
				for (int j =0; j<parameterTypes.length;j++) {
					if (j==parameterTypes.length-1) {
						System.out.println(parameterTypes[j].getName()+" arg"+j);
					}else{
						System.out.println(parameterTypes[j].getName()+" arg"+j+",");
					}
					
				}
				System.out.println("){}");
				System.out.println();
			}
			
			System.out.println("�����е�������:");
			//�����ȡ����������  
			Field[] declaredFields = c.getDeclaredFields();
			for (int i = 0; i < declaredFields.length; i++) {
				Class<?> type = declaredFields[i].getType();
				int mo = declaredFields[i].getModifiers();
				String string = Modifier.toString(mo); // ������Ȩ�޵���ֵת���ɾ�������η�����
				System.out.print( string + " "+ type.getName() +" "+declaredFields[i].getName()+";");
				System.out.println();
			}
			
			
			Field[] fields = c.getFields(); //��ȡ�����е�����
			
			System.out.println("������߽ӿ��е�������:");
			for (int i = 0; i < fields.length; i++) {
				Class<?> type = fields[i].getType();
				int mo = fields[i].getModifiers();
				String string = Modifier.toString(mo); // ������Ȩ�޵���ֵת���ɾ�������η�����
				System.out.print( string + " "+ type.getName() +" "+fields[i].getName()+";");
				System.out.println();
			}
			
			//�����ȡ�����Ľṹ
			
			System.out.println("�����еķ���");
			Method[] declaredMethods = c.getDeclaredMethods();
			for (int i = 0; i < declaredMethods.length; i++) {
				int modifiers = declaredMethods[i].getModifiers();
				String string = Modifier.toString(modifiers);
				
				Class<?> returnType = declaredMethods[i].getReturnType();
				String returnTypeStr = returnType.getName();
				
				String methodName = declaredMethods[i].getName();
				
				Class<?>[] pts = declaredMethods[i].getParameterTypes();
				String params="";
				for (int j = 0; j < pts.length; j++) {
					if (j==pts.length-1) {
						params = pts.toString();
					} else {
						params = pts.toString()+",";
					}
				}
				
				System.out.print(string+" "+returnTypeStr+" "+methodName+"("+params+")");
				System.out.println();
			}
			
			
			System.out.println("����ͽӿ��Լ���������з���");
			Method[] methods = c.getMethods();// �ܴ�ӡ��Object���� �Լ����� �ͽӿ� ����������з���
			for (int i = 0; i < methods.length; i++) {
				int modifiers = methods[i].getModifiers();
				String string = Modifier.toString(modifiers);
				
				Class<?> returnType = methods[i].getReturnType();
				String returnTypeStr = returnType.getName();
				
				String methodName = methods[i].getName();
				
				Class<?>[] pts = methods[i].getParameterTypes();
				String params="";
				for (int j = 0; j < pts.length; j++) {
					if (j==pts.length-1) {
						params = pts.toString();
					} else {
						params = pts.toString()+",";
					}
				}
				
				System.out.print(string+" "+returnTypeStr+" "+methodName+"("+params+")");
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
