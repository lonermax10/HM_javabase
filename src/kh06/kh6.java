package kh06;

import java.util.Scanner;

/**
 * ѭ�������ַ���������Щ������ַ�������������������������ַ���Ϊ��exit���ͽ���ѭ���������ʾ��������������ַ�����
���磺����abc      ����def        ����exit
      �����abcdefexit

 * @author WangXin
 *
 */
public class kh6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		do{
			System.out.println("������һ���ַ�����");
			String str = input.nextLine();
			
			if(str=="exit"){
				break;
			}
		}while(true);
	}

}
