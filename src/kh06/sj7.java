package kh06;

import java.util.Scanner;

/**
 * �����ɵ����������һ��1��100(�����Լ�����)��һ���������Ȼ����������£�
����´��ˣ����Ծ���ʾ�����ˡ��������С�ˣ����Ծ���ʾ��С�ˡ���
����¶��ˣ����Ծ���ʾ�����ˡ�������������������¡�
 * @author WangXin
 *
 */
public class sj7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = (int)(Math.random()*100+1);
		
		for(int i=0;i<100;i++){
			System.out.println("��������µ����֣�");
			int guess =input.nextInt();
			if(guess>num){
				System.out.println("�´��ˣ�");
				System.out.println("----------------");
			}else if(guess<num){
				System.out.println("��С�ˣ�");
				System.out.println("----------------");
			}else if(guess==num){
				System.out.println("�¶��ˣ�");
				System.out.println("----------------");
				break;
			}
		}
		input.close();
	}

}
