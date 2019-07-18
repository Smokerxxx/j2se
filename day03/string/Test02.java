package string;

import java.util.List;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s ="      abc      ";
		
		s.trim(); // 去左右空格   ,但是s变量内容依然是"      abc      "
		s=s.trim();  // 字符串如果需要改变  , 左侧要加入赋值操作
		
		
		s.length();
		s.isEmpty();//当length==0时  ,改方法true 
		if ("1111".equals(s)) { //在判断内容时,要把常量放前面
			
		}
		
		
		if (null!=s) {
			
		}
		
		"ABCdefGh".equalsIgnoreCase(s); //忽略大小写的判断
		
		s.toLowerCase();// 转换小写
		s.toUpperCase();// 转换大写
		
		s.toString();//返回字符串本身
		
		s.concat("def"); // 单纯调用concat ,并不会改变s  ,还需要再赋值
		
		s.indexOf(".");//返回第一次出现. 的索引位置   , 如果没有找到返回-1
		s.lastIndexOf("."); //返回最后一次出现.  的索引位置
		
		s.charAt(0); // 返回索引位置的字符
		
		s.substring(0, 3) ; //[0,3)
		s.substring(0); // 从索引0开始到最后
		
		
		//字符串提供了一个valueOf方法  ,将不同的基本数据类型转换为字符串
		String valueOf = String.valueOf(1);
		
		String[] split = s.split(","); //   如果有特殊字符 用转译符号转译   \\
		
		System.out.println(s);
	}

}
