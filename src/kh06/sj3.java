package kh06;

import java.util.Scanner;

/**
 * 循环录入某学生5门课的成绩并计算平均分，如果某分数录入为负，停止录入并提示录入错误
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
			System.out.println("请输入第" + (i + 1) + "门课的成绩。");
			score[i] = input.nextInt();
			if (score[i] < 0) {
				System.out.println("成绩错误！");
				break;
			}
			sum += score[i];

		}
		System.out.println("平均成绩：" + (sum/5));
		input.close();
	}

}
