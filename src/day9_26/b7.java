package day9_26;
/**
 * �����ĸ�������a='A';b='B',c='C',d='D';���ڱ��ʵ��a��d�����е�
    ֵ������b��c�е�ֵ������������a��b��c��d�е�ֵ��

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
