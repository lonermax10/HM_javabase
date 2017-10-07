package kh06;

import java.util.Scanner;

/**
 * 输入一批数字，求这一批数字的最大值，最小值，输入0截止
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
			System.out.println("请输入一个数字：");
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
		System.out.println("最小值:" + max);
		System.out.println("最小值:" + min);
		//input.close();
	}

}
