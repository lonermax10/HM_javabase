package day9_28;

import java.util.Scanner;

/**
 * 定义长度为4的字符串数组  循环将4个输入的字符串赋值给数组每个元素 再循环显示该数组
 * 
 * @author WangXin
 *
 */

public class s4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] a = new String[4];
		for(int i =0; i< a.length; i++){
			System.out.println("请输入第"+(i+1)+"个字符！");
			a[i]=input.nextLine();
		}
		
		input.close();
		for(int i =0; i< a.length; i++){
			System.out.print(a[i] +"\t");
		}
	}

}
