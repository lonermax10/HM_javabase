package kh05;

import java.util.Scanner;

/**
 * �������ѧ�������������������ʽ���£�
	�������1��ѧ������������԰��
	��1��ѧ���������ǣ���԰��
	
	�������2��ѧ��������������
	��2��ѧ���������ǣ�����
	������������������������

 * @author WangXin
 *
 */

public class sj9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] name = new String[100];
		for(int i=0; i<100;i++){
			System.out.print("�������" + (i+1) + "��ѧ����������");
			name[i] = input.next();
			System.out.println("��"+(i+1)+"��ѧ���������ǣ�" + name[i]);
		}
		input.close();
	}

}
