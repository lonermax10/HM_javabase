package kh05;

import java.util.Scanner;

/**
 * ѭ������5��ѧ���ĳɼ�������5��ѧ���ĳɼ��ۼӣ������������
 * 
 * @author WangXin
 *
 */

public class sj1 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		int sum = 0;
		System.out.println("���������ѧ���ĳɼ���");
		for(int i=0; i <6; i++){
			int score = input.nextInt();
			sum += score;
			
		}
		System.out.println("�ɼ���Ϊ��" + sum);
		input.close();
	}

}
