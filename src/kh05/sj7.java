package kh05;

import java.util.Scanner;

/**
 * ѭ�������ַ���������Щ������ַ�������������������������ַ���Ϊ��Esc���ͽ���ѭ���������ʾ��������������ַ�����
���磺����abc      ����def        ����Esc
      �����abcdef

 * @author WangXin
 *
 */

public class sj7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] a = new String[10];
		for(int i = 0; i < 100; i++){
			System.out.println("������һ���ַ�����");
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
