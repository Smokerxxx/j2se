package E_序列化ObjectInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Users h1 = new Users("张三","210104198201010101",27,new Date() );
		Users hehe1 = new Users("王1","210104198201010101",27,new Date() );
		Users hehe2 = new Users("王2","210104198201010102",28,new Date() );
		Users hehe3 = new Users("王3","210104198201010103",29,new Date() );
		
		List<Users> list = new ArrayList<Users>();
		list.add(hehe1);
		list.add(hehe2);
		list.add(hehe3);
		
		Test.write2File(h1);
		Test.write2File(list);
		
		
		Test.read4File();
		Test.read4FileList();
	}
	
	private static void write2File(Users u){
		try {

			ObjectOutputStream os= new ObjectOutputStream(
					new FileOutputStream("c:\\xuliehua.txt"));
			os.writeObject(u);
			os.close();
			System.out.println("jiesule");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void write2File(List<Users> list){
		try {

			ObjectOutputStream os= new ObjectOutputStream(
					new FileOutputStream("c:\\xuliehua2.txt"));
			os.writeObject(list);
			os.close();
			System.out.println("jiesule");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void read4File(){
		try {
			ObjectInputStream is = new ObjectInputStream(
					new FileInputStream("c:\\xuliehua.txt"));
			
			Users temp = (Users)is.readObject();
			
			System.out.println(temp.toString());
			
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void read4FileList(){
		try {
			ObjectInputStream is = new ObjectInputStream(
					new FileInputStream("c:\\xuliehua2.txt"));
			
			List<Users> temp = (List<Users>)is.readObject();
			
			for (Users i : temp) {
				System.out.println(i.toString());
			}
			
			
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
