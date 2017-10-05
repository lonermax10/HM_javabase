package day9_26;
/**
 * 定义一个变量保存正方形的边长，计算此正方形的周长，及面积。
 * 
 * @author WangXin
 *
 */

public class b3 {
	public static void main(String[] args) {
		int length = 5;
		int perimeter = length*4;
		int area = length * length;
		System.out.println("正方形边长：" + length);
		System.out.println("周长：" + perimeter);
		System.out.println("面积：" + area);
	}

}
