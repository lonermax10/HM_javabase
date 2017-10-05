package kh05;

import java.util.Scanner;

/**
 * 接收五个学生的姓名，并输出。格式如下：
	请输入第1个学生的姓名：傅园慧
	第1个学生的姓名是：傅园慧
	
	请输入第2个学生的姓名：库里
	第2个学生的姓名是：库里
	。。。。。。。。。。。。

 * @author WangXin
 *
 */

public class sj9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] name = new String[100];
		for(int i=0; i<100;i++){
			System.out.print("请输入第" + (i+1) + "个学生的姓名：");
			name[i] = input.next();
			System.out.println("第"+(i+1)+"个学生的姓名是：" + name[i]);
		}
		input.close();
	}

}
