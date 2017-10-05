package day9_26;
/**
 * 定义两个变量，a=6.89;b=8.9; 定义一个中间变量来实现交换a与b变量中的值交换，
   最后输出a与b中的值。

 * @author WangXin
 *
 */

public class b6 {
	public static void main(String[] args) {
		float a=6.89f;
		float b=8.9f;
		float temp;
		
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		
	}

}
