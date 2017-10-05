package kh05;

import java.util.Scanner;

/**
 * 首先要求用户输入学生的数目放入到变量n中，如果这个数大于0，
那么就循环n次接收n个学生的成绩，计算总分及平均分。
否则输出“学生的人数不能为负数”.


 * @author WangXin
 *
 */

public class sj2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum=0;
		System.out.print("请输入学生数目:");
		int n = input.nextInt();
		if(n>0){
			System.out.println("请依次输入" + n +"个学生的成绩：");
			for(int i = 0; i < n; i++){
				int score =input.nextInt();
				sum +=score;
				
			}
			System.out.println("学生总成绩为：" + sum);
			System.out.println("学生平均成绩为：" + sum/n);
		}else{
			System.out.println("学生的人数不能为负数");
		}
		input.close();
	}

}
