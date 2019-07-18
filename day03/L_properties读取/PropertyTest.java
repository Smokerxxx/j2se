package L_properties��ȡ;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Properties; 

/**
 * properties �ļ� ����java�е������ļ�
 * 
 * 
 * 
 * ��Properties��̳���Hashtable�ಢ��ʵ����Map�ӿڣ�Ҳ��ʹ��һ�ּ�ֵ�Ե���ʽ���������Լ�������Properties������ĵط����������ļ���ֵ�����ַ������͡�
 * 
 * load(InputStream inStream)  ,���ļ���(key=value)һ����ȫ�����ص�������


	store(OutputStream out, String comments)  ,�������ж����key:value ,һ����д�뵽�ļ���

	getProperty(key)/setProperty(key,value) �����������Ƿֱ��ǻ�ȡ������������Ϣ��
 * @author lgp
 *
 */
public class PropertyTest {
    public static void main(String[] args) { 
//    	PropertyTest.read();
            
    	PropertyTest.write();
    }
    
    /**
     * ��java��Դ·���¶�ȡa.properties�ļ�
     */
    private static void read(){
        Properties prop = new Properties();     
        try{
            //��ȡ�����ļ�a.properties
        	InputStream in =PropertyTest.class.getClassLoader().getResourceAsStream("a.properties");
//            InputStream in = new BufferedInputStream (new FileInputStream("a.properties"));
//          prop.load(in);     ///���������б� , ����û�����ĵ����  
            prop.load(new InputStreamReader(in, "UTF-8"));   // ��������ļ��а�������,�����ֶ�ȡ
            Iterator<String> it=prop.stringPropertyNames().iterator();
            while(it.hasNext()){
                String key=it.next();
                System.out.println(key+":"+prop.getProperty(key));
            }
            in.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    /**
     * д�뵽properties�ļ�
     */
    private static void write(){    
        try{
	        ///�������Ե�b.properties�ļ�
	        FileOutputStream oFile = new FileOutputStream("c:\\b.properties", true);//true��ʾ׷�Ӵ�
	        Properties prop2 = new Properties();  
	        prop2.setProperty("phone", "13387889898");
	        prop2.setProperty("����", "����");
	//        prop2.store(oFile, "The New properties file");//��д��û������ʱ
	        prop2.store(new OutputStreamWriter(oFile, "utf-8"), "Document Header "); //��д�����ݰ�������, �ĵ�ͷ����ϵͳʱ��Ҳһ��д�뵽�ĵ���ע����
	        
	        oFile.close();
	    }
	    catch(Exception e){
	        System.out.println(e);
	    }
    }
    	
}
