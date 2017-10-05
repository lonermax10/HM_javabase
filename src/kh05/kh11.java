package kh05;

import java.util.Scanner;

/**
 * 输入一个整数，记录在变量n中， 计算1+2+……+n的结果。
 * 
 * @author WangXin
 *
 */
public class kh11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int n = input.nextInt();
		int i = 0;
		int sum = 0;
		while (i <n) {
			i++;
			sum += i;
		}
		System.out.println(sum);
		input.close();

	}
}
