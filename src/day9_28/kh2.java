package day9_28;

import java.util.Scanner;

/**
 * ����һ���ַ��������飬�ռ�Ϊ5����ʹ��ѭ���������ѧ������������ʹ��ѭ����������ѧ��������.
 * 
 * @author WangXin
 *
 */

public class kh2 {
	public static void main(String[] args) {
		Scanner input = new  Scanner(System.in);
		String[] name = new String[5];
		for(int i = 0; i < name.length; i++){
			System.out.print("�������" + (i+1) + "��ѧ�������֣�"+"\t");
			name[i] = input.nextLine();
		}
		
		for(int i = 0; i < name.length; i++){
			System.out.print("��" +(i+1) +"��ѧ���������ǣ�" + name[i] + "\t");
		}
		input.close();
		
	}

}
