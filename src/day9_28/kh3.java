package day9_28;

import java.util.Scanner;

/**
 * ����һ��int�͵����飬ѭ������8��ѧ���ĳɼ���������8��ѧ�����ּܷ�ƽ���֡�
 * 
 * @author WangXin
 *
 */

public class kh3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] score = new int[8];
		int sum = 0;
		
		System.out.println("����������8λͬѧ�ĳɼ���");
		for(int i =0; i < score.length; i++){
			score[i]=input.nextInt();
			sum += score[i];
			
		}
		int avg = sum/8;
		System.out.println(sum + "," + avg);
		input.close();
	}

}
