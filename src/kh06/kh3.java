package kh06;

import java.util.Scanner;

/**
 * ����һ�����֣�����һ�����ֵ����ֵ����Сֵ������0��ֹ
 * 
 * @author WangXin
 *
 */
public class kh3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		int max=0;
		int min=0;
		
		while (true) {
			System.out.println("������һ�����֣�");
			num = input.nextInt();
			if(num>max){
				max=num;
			}
			if(num<min){
				min=num;
			}
			if(num == 0){
				break;
			}
		}
		System.out.println("��Сֵ:" + max);
		System.out.println("��Сֵ:" + min);
		//input.close();
	}

}
