package day9_26;
/**
 * ��������������a=6.89;b=8.9; ����һ���м������ʵ�ֽ���a��b�����е�ֵ������
   ������a��b�е�ֵ��

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
