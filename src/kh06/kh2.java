package kh06;

import java.util.Scanner;

/**
 * ѭ���������֣�����0���˳�ѭ���������ʾ���������ĸ�����ż���ĸ�����
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
			System.out.println("������һ�����֣�");
			num = input.nextInt();
			if (num % 2 == 0) {
				sumO++;
			}if (num % 2 != 0) {
				sumJ++;
			}if(num == 0) {
				break;
			}
		}
		System.out.println("����������" + sumJ);
		System.out.println("ż��������" + sumO);
		input.close();
	}

}
// while
// for
// do while
// switch
