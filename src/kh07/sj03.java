package kh07;

import java.util.Scanner;

/**
 * 用for循环+do while循环实现：
	做十道题，每一道题做完后都询问是否最对了 如果是错继续做 对了则继续做下一道题
	第一题：
		做题。。。。
		对了吗？
		（输入）错
		做题。。。。
		对了吗？
		（输入）错
		做题。。。。
		对了吗？	
		（输入）对
	第二题：
		。。。。。。。
	第三题：
		。。。。。。。

 * @author WangXin
 *
 */
public class sj03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String anser;
		
		for(int i=0;i<10;i++){
			System.out.println("第"+(i+1)+"题：");
			do{
				System.out.println("做题。。。。");
				System.out.println("对了吗？(yes/no)");
				anser=input.next();
				
			}while(anser.contains("no"));
			
		}
		input.close();
	}

}
