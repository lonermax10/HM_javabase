package kh05;

/**
 * ����1+3+5+���������������ӵ����ĺ���500ʱ �������ӵ��Ǹ��� (ע��i�ĸı��sum=sum+i��λ��)
 * 
 * @author WangXin
 *
 */
public class kh10 {
	public static void main(String[] args) {
		int n, sum = 0;

		for (n = 1; n < 500; n += 2) {
			if (sum > 500)
				break;
			sum = sum + n;

		}
		n = n - 2;
		System.out.println("���ӵ��Ǹ���Ϊ" + n);
	}

}
