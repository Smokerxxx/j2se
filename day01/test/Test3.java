package test;
/**
 * 选择排序
 * 
 * 特点： 先找小的值，放在数组的最前面
 * @author Administrator
 *
 */
public class Test3 {

	public static void main(String[] args) {
		int[] arr = {6,4,8,9,0,-1};
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j =i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}

	}

}
