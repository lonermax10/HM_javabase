package day9_28;
/**
 * ���峤��Ϊ4 ���ַ����� Ĭ��ֵΪ 'a' 'c' 'c' 'p'
	��ʾ������� ÿһ��Ԫ��:X[0] X[1] X[2] X[3]
	Ȼ��ֵ�ٴθ�ֵΪ 'J' 'a' 'v' 'a'
	����ʾ 

 * @author WangXin
 *
 */

public class s1 {
	public static void main(String[] args) {
		char[] a = {'a' ,'c' ,'c' ,'p'};
		for(int i=0;i < a.length;i++){
			System.out.print(a[i]+"\t");
		}
		
		a[0] = 'j';
		a[1] = 'a';
		a[2] = 'v';
		a[3] = 'a';
		System.out.println("\n");
		for(int i=0;i < a.length;i++){
			System.out.print(a[i]+"\t");
		}
		
	}

}
