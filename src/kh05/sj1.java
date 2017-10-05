package kh05;

import java.util.Scanner;

/**
 * 循环输入5个学生的成绩，将这5个学生的成绩累加，最后输出结果。
 * 
 * @author WangXin
 *
 */

public class sj1 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		int sum = 0;
		System.out.println("请输入五个学生的成绩：");
		for(int i=0; i <6; i++){
			int score = input.nextInt();
			sum += score;
			
		}
		System.out.println("成绩和为：" + sum);
		input.close();
	}

}
