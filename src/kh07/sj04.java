package kh07;

/**
 * 打印如下图形
 * 
 ** 
 *** 
 **** 
 * 
 * 
 * @author WangXin
 *
 */
public class sj04 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
