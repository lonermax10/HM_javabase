package kh05;

import java.util.Scanner;

/**
 * ����Ҫ���û�����ѧ������Ŀ���뵽����n�У�������������0��
��ô��ѭ��n�ν���n��ѧ���ĳɼ��������ּܷ�ƽ���֡�
���������ѧ������������Ϊ������.


 * @author WangXin
 *
 */

public class sj2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum=0;
		System.out.print("������ѧ����Ŀ:");
		int n = input.nextInt();
		if(n>0){
			System.out.println("����������" + n +"��ѧ���ĳɼ���");
			for(int i = 0; i < n; i++){
				int score =input.nextInt();
				sum +=score;
				
			}
			System.out.println("ѧ���ܳɼ�Ϊ��" + sum);
			System.out.println("ѧ��ƽ���ɼ�Ϊ��" + sum/n);
		}else{
			System.out.println("ѧ������������Ϊ����");
		}
		input.close();
	}

}
