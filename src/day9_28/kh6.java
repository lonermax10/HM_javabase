package day9_28;

import java.util.Scanner;

/**
 * ѭ������5��ѧ���ĳɼ����뵽һ�����ε������У�Ȼ�������5��ѧ����ƽ���֣���������ʽ���£�
	ѧ��1	ѧ��2	ѧ��3	ѧ��4	ѧ��5
	80	90	95	82	96
	ƽ�����ǣ�����


 * @author WangXin
 *
 */

public class kh6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������ѧ���ĳɼ���");
		int[] score = new int[5];
		int sum = 0;
		
		for(int i = 0;i<score.length;i++){
			
			System.out.print("�������" + (i+1) + "��ѧ���ĳɼ�:");
			score[i]=input.nextInt();
			sum += score[i];
		}
		System.out.println("ѧ��1\t" + "ѧ��2\t" + "ѧ��3\t" + "ѧ��4\t" + "ѧ��5");
		for(int j=0; j < score.length; j++){
			System.out.print(score[j] + "\t");
		}
		System.out.println("ƽ���ɼ���" + (sum/5));
		input.close();
	}

}
