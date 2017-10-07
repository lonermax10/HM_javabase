package kh06;

import java.util.Scanner;

/**
 * 循环输入数字，输入0则退出循环。最后显示其中奇数的个数与偶数的个数。
 * 
 * @author WangXin
 *
 */
public class kh2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		int sumJ = 0;
		int sumO = 0;
		
		while (true) {
			System.out.println("请输入一个数字：");
			num = input.nextInt();
			if (num % 2 == 0) {
				sumO++;
			}if (num % 2 != 0) {
				sumJ++;
			}if(num == 0) {
				break;
			}
		}
		System.out.println("奇数个数：" + sumJ);
		System.out.println("偶数个数：" + sumO);
		input.close();
	}

}
// while
// for
// do while
// switch
