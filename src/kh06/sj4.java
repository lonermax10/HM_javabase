package kh06;

import java.util.Scanner;

/**
 * ѭ��100�Ρ��Ұ��㣬�㰮���𣿡���ֱ���Է�˵�����ͽ���ѭ��
 * 
 * @author WangXin
 *
 */
public class sj4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�㰮����");
		String love =input.next();
		
		if(love.equals("��")){
			for(int i=0;i<100;i++){
				System.out.println("��Ҳ����");
				
			}
		}else{
			System.out.println("��Ҳ�����㣡");
		}
		input.close();
	}

}
