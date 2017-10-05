package kh05;

/**
 * 计算1+3+5+。。。。。。当加到他的和是500时 ，求最后加的那个数 (注意i的改变和sum=sum+i的位置)
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
		System.out.println("最后加的那个数为" + n);
	}

}
