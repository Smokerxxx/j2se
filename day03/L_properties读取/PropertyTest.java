package L_properties读取;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Properties; 

/**
 * properties 文件 属于java中的配置文件
 * 
 * 
 * 
 * 　Properties类继承自Hashtable类并且实现了Map接口，也是使用一种键值对的形式来保存属性集。不过Properties有特殊的地方，就是它的键和值都是字符串类型。
 * 
 * load(InputStream inStream)  ,将文件中(key=value)一次性全部加载到程序中


	store(OutputStream out, String comments)  ,将程序中定义的key:value ,一次性写入到文件中

	getProperty(key)/setProperty(key,value) 这两个方法是分别是获取和设置属性信息。
 * @author lgp
 *
 */
public class PropertyTest {
    public static void main(String[] args) { 
//    	PropertyTest.read();
            
    	PropertyTest.write();
    }
    
    /**
     * 从java资源路径下读取a.properties文件
     */
    private static void read(){
        Properties prop = new Properties();     
        try{
            //读取属性文件a.properties
        	InputStream in =PropertyTest.class.getClassLoader().getResourceAsStream("a.properties");
//            InputStream in = new BufferedInputStream (new FileInputStream("a.properties"));
//          prop.load(in);     ///加载属性列表 , 用于没有中文的情况  
            prop.load(new InputStreamReader(in, "UTF-8"));   // 如果配置文件中包含中文,用这种读取
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
     * 写入到properties文件
     */
    private static void write(){    
        try{
	        ///保存属性到b.properties文件
	        FileOutputStream oFile = new FileOutputStream("c:\\b.properties", true);//true表示追加打开
	        Properties prop2 = new Properties();  
	        prop2.setProperty("phone", "13387889898");
	        prop2.setProperty("姓名", "李四");
	//        prop2.store(oFile, "The New properties file");//当写入没有中文时
	        prop2.store(new OutputStreamWriter(oFile, "utf-8"), "Document Header "); //当写入内容包含中文, 文档头部和系统时间也一起写入到文档的注释区
	        
	        oFile.close();
	    }
	    catch(Exception e){
	        System.out.println(e);
	    }
    }
    	
}
