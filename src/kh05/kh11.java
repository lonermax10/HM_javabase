package kh05;

import java.util.Scanner;

/**
 * ����һ����������¼�ڱ���n�У� ����1+2+����+n�Ľ����
 * 
 * @author WangXin
 *
 */
public class kh11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��������");
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
