package day9_28;

import java.util.Scanner;

/**
 * ���峤��Ϊ4���ַ�������  ѭ����4��������ַ�����ֵ������ÿ��Ԫ�� ��ѭ����ʾ������
 * 
 * @author WangXin
 *
 */

public class s4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] a = new String[4];
		for(int i =0; i< a.length; i++){
			System.out.println("�������"+(i+1)+"���ַ���");
			a[i]=input.nextLine();
		}
		
		input.close();
		for(int i =0; i< a.length; i++){
			System.out.print(a[i] +"\t");
		}
	}

}
