package day9_26;
import java.util.*;
/**
 * 输入圆的半径，用程序计算圆的周长和面积
 * 
 * @author WangXin
 *
 */

public class b8 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		final double PI = 3.148525;
		System.out.print("请输入元的半径：");
		double radius = input.nextDouble();
		double perimeter = PI*(2*radius);
		double area = PI*radius*radius;
		System.out.println("圆的周长是："+ perimeter);
		System.out.println("圆的面积是："+ area);
		input.close();
		
		
	}

}
