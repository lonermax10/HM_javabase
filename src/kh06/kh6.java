package kh06;

import java.util.Scanner;

/**
 * 循环输入字符串，将这些输入的字符串都连接起来，至到输入的字符串为“exit”就结束循环，最后显示这个连接起来的字符串。
比如：输入abc      输入def        输入exit
      就输出abcdefexit

 * @author WangXin
 *
 */
public class kh6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		do{
			System.out.println("请输入一个字符串：");
			String str = input.nextLine();
			
			if(str=="exit"){
				break;
			}
		}while(true);
	}

}
