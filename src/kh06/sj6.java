package kh06;
/**
 * ����һ������ ��Ҫ���ʽ���£�( ����Ϊ6,forѭ����)
0+6��6
1+5��6
2+4��6
3+3��6
4+2��6
5+1��6
6+0��6

 * @author WangXin
 *
 */
public class sj6 {
	public static void main(String[] args) {
		int n = 6;
		for (int i = 0; i <= n; i++) {
			int j = n;
			if (i == n)
				System.out.println("0+" + n + "=" + n);
			else
				System.out.println(i + "+" + (j - i) + "=" + n);
		}
	}

}
