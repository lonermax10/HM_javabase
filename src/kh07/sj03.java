package kh07;

import java.util.Scanner;

/**
 * ��forѭ��+do whileѭ��ʵ�֣�
	��ʮ���⣬ÿһ���������ѯ���Ƿ������ ����Ǵ������ �������������һ����
	��һ�⣺
		���⡣������
		������
		�����룩��
		���⡣������
		������
		�����룩��
		���⡣������
		������	
		�����룩��
	�ڶ��⣺
		��������������
	�����⣺
		��������������

 * @author WangXin
 *
 */
public class sj03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String anser;
		
		for(int i=0;i<10;i++){
			System.out.println("��"+(i+1)+"�⣺");
			do{
				System.out.println("���⡣������");
				System.out.println("������(yes/no)");
				anser=input.next();
				
			}while(anser.contains("no"));
			
		}
		input.close();
	}

}
