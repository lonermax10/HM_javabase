package day9_28;

/**
 * ����һ��char�͵����飬�ڴ�����ĵ�Ԫ���зֱ����"�Ұ���"�����ַ���Ȼ��ʹ��ѭ�����������������"�㰮��"���������һ��Ԫ��ѭ������һ��Ԫ�أ�
 * 
 * @author WangXin
 *
 */

public class kh5 {
	public static void main(String[] args) {
		char[] a = { '��', '��', '��' };
		
		for (int i = 0; i < a.length; i++) {
			
			char value = a[a.length - (i + 1)];
			
			System.out.print(value + "\t");
		}
	}

}
