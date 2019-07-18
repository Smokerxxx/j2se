package map.hashmap;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 做一个近5年的NBA冠军球队的map集合
 * 
 * 要求: 输入年份  ,获取对应球队的名称
 * @author Administrator
 *
 */
public class Lianxi1 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		
		map.put(2014, "公牛");
		map.put(2015, "湖人");
		map.put(2016, "小牛");
		map.put(2017, "骑士");
		map.put(2018, "纽约");
		map.put(2019, "猛龙");
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个年份");
		int nextInt = input.nextInt();
		
		if (map.containsKey(nextInt)) {
			String string = map.get(nextInt);
			System.out.println("有,是"+string);
		} else {
			System.out.println("没有该年份数据");
		}
	}
}
