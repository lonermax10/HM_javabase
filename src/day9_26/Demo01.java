package day9_26;
/**
 *  ��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ������ĸ��º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣�
 *  
 * @author WangXin
 *
 */

public class Demo01 {
	public static void main(String args[]) {
		for (int i = 1; i <= 20; i++)
			System.out.println(f(i));
	}

	public static int f(int x) {
		if (x == 1 || x == 2)
			return 1;
		else
			return f(x - 1) + f(x - 2);
	}

}
