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
		String[] a = new String[10];
		for(int i = 0; i < 100; i++){
			System.out.println("������һ���ַ�����");
			a[i] = input.nextLine();
			if(a.equals("exit")){
				for(int j = 0; j< a.length; i++){
					System.out.println(a[j]+"exit");
				}
				break;
			}
		}
		input.close();
		
	}

}
