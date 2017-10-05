package day9_28;

import java.util.Scanner;

/**
 * 循环输入5个学生的成绩放入到一个整形的数组中，然后计算这5个学生的平均分，最后输出格式如下：
	学生1	学生2	学生3	学生4	学生5
	80	90	95	82	96
	平均分是：？？


 * @author WangXin
 *
 */

public class kh6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入五个学生的成绩：");
		int[] score = new int[5];
		int sum = 0;
		
		for(int i = 0;i<score.length;i++){
			
			System.out.print("请输入第" + (i+1) + "个学生的成绩:");
			score[i]=input.nextInt();
			sum += score[i];
		}
		System.out.println("学生1\t" + "学生2\t" + "学生3\t" + "学生4\t" + "学生5");
		for(int j=0; j < score.length; j++){
			System.out.print(score[j] + "\t");
		}
		System.out.println("平均成绩：" + (sum/5));
		input.close();
	}

}
