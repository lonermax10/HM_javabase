package kh06;

import java.util.Scanner;

/**
 * ѭ��¼��ĳѧ��5�ſεĳɼ�������ƽ���֣����ĳ����¼��Ϊ����ֹͣ¼�벢��ʾ¼�����
 * 
 * @author WangXin
 *
 */
public class sj3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] score = new int[5];
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("�������" + (i + 1) + "�ſεĳɼ���");
			score[i] = input.nextInt();
			if (score[i] < 0) {
				System.out.println("�ɼ�����");
				break;
			}
			sum += score[i];

		}
		System.out.println("ƽ���ɼ���" + (sum/5));
		input.close();
	}

}
