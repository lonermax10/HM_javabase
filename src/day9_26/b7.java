package day9_26;
/**
 * 定义四个变量，a='A';b='B',c='C',d='D';现在编程实现a与d变量中的
    值交换，b与c中的值交换。最后输出a、b、c、d中的值。

 * @author WangXin
 *
 */

public class b7 {
	public static void main(String[] args) {
		char a='A';
		char b='B';
		char c='C';
		char d='D';
		char temp;
		
		temp = a;
		a = d;
		d = temp;
		
		temp = b;
		b = c;
		c = temp;
		System.out.println(a+" "+b+" "+c+" "+d);
		
	}

}
