package ����ֵ���͵ļ���;

import java.math.BigDecimal;
import java.math.BigInteger;
/**
 * BigInteger  �������ᳬ��Integer��Χ����ֵʱʹ��  ,
 * ֻ������������  . С�������ø���
 * @author Administrator
 *
 */
public class BigIntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger big1 = new BigInteger("2147483648");
		BigInteger big2 = new BigInteger("3453453");
		
//		System.out.println(big1.add(big2));
//		System.out.println(big1.subtract(big2));
//		System.out.println(big1.multiply(big2));
//		System.out.println(big1.divide(big2));
//		System.out.println(big1.max(big2));// �ȽϷ��ؽϴ�����ֵ
//		System.out.println(big1.min(big2));// �ȽϷ��ؽ�С����ֵ
//		
//		
//		BigInteger[] result = big1.divideAndRemainder(big2);
//		System.out.println("��:"+result[0]+"����:"+result[1]);
		
		
		
		//---------------------------------------------------
		
		BigDecimal bigd_1 = new BigDecimal(2147483648.11);
		BigDecimal bigd_2 = new BigDecimal(2147483648.11);
		BigDecimal result = bigd_1.add(bigd_2);
		double d3 = BigIntegerTest.round(result.doubleValue(), 2);
		System.out.println(d3);
	}
	
	public static double round(double d , int len){
		BigDecimal d1 = new BigDecimal(d);
		BigDecimal d2 = new BigDecimal(1);
		
		return d1.divide(d2,len, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

}
