package kh05;

import java.util.Scanner;

/**
 * �������꣬�ۿ������ڼ���ӯӯ���飺����һ�Σ�������������⣬�Ժ�Ͳ��ò����ˣ�����ÿ�춼Ҫ���ţ�ֱ���ֳ�������������Ϊֹ�� 
 * 
 * @author WangXin
 *
 */

public class sj5 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		String ch;
		do{
			System.out.println("���ţ�");
			
			ch = input.nextLine();
		}while(ch != "y" || ch != "Y");
		System.out.println("����");
		input.close();
	}

}
