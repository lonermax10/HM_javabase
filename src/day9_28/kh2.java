package day9_28;

import java.util.Scanner;

/**
 * 声明一个字符串的数组，空间为5个。使用循环接收五个学生的姓名。再使用循环输出这五个学生的姓名.
 * 
 * @author WangXin
 *
 */

public class kh2 {
	public static void main(String[] args) {
		Scanner input = new  Scanner(System.in);
		String[] name = new String[5];
		for(int i = 0; i < name.length; i++){
			System.out.print("请输入第" + (i+1) + "个学生的名字："+"\t");
			name[i] = input.nextLine();
		}
		
		for(int i = 0; i < name.length; i++){
			System.out.print("第" +(i+1) +"个学生的名字是：" + name[i] + "\t");
		}
		input.close();
		
	}

}
