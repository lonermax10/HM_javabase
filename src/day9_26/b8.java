package day9_26;
import java.util.*;
/**
 * ����Բ�İ뾶���ó������Բ���ܳ������
 * 
 * @author WangXin
 *
 */

public class b8 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		final double PI = 3.148525;
		System.out.print("������Ԫ�İ뾶��");
		double radius = input.nextDouble();
		double perimeter = PI*(2*radius);
		double area = PI*radius*radius;
		System.out.println("Բ���ܳ��ǣ�"+ perimeter);
		System.out.println("Բ������ǣ�"+ area);
		input.close();
		
		
	}

}
