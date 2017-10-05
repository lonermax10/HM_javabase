package kh05;

import java.util.Scanner;

/**
 * 循环输入字符串，将这些输入的字符串都连接起来，至到输入的字符串为“Esc”就结束循环，最后显示这个连接起来的字符串。
比如：输入abc      输入def        输入Esc
      就输出abcdef

 * @author WangXin
 *
 */

public class sj7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] a = new String[10];
		for(int i = 0; i < 100; i++){
			System.out.println("请输入一个字符串：");
			a[i] = input.nextLine();
			if(a.equals("Esc")){
				for(int j = 0; j< a.length; i++){
					System.out.println(a[j]);
				}
				break;
			}
		}
		input.close();
		
	}

}
