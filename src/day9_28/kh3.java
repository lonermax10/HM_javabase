package day9_28;

import java.util.Scanner;

/**
 * 声明一个int型的数组，循环接收8个学生的成绩，计算这8个学生的总分及平均分。
 * 
 * @author WangXin
 *
 */

public class kh3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] score = new int[8];
		int sum = 0;
		
		System.out.println("请依次输入8位同学的成绩：");
		for(int i =0; i < score.length; i++){
			score[i]=input.nextInt();
			sum += score[i];
			
		}
		int avg = sum/8;
		System.out.println(sum + "," + avg);
		input.close();
	}

}
