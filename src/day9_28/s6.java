package day9_28;

import java.util.Scanner;

/**
 * 定义长度为5的浮点型数组表示身高
	由循环输入来给每个元素赋值
	显示数组的每个元素
	最后计算平均身高


 * @author WangXin
 *
 */

public class s6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float[] h = new float[5];
		for(int i = 0; i < h.length; i++){
			System.out.print("请输入第" + (i+1) + "个人的身高：");
			h[i] = input.nextFloat();
			
		}
		
		for(int i = 0; i < h.length; i++){
			System.out.print("身高：" + h[i] + "\t");
		}
		input.close();
		
	}

}
