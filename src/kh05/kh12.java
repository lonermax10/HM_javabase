package kh05;

import java.util.Scanner;

/**
 * ������㰮���𣿡������ջش�
   ����Է����롰��������ѭ��
   ˵����Ҳ���㡱100�Ρ�
   �����˵������Ҳ�����㡱��

 * @author WangXin
 *
 */
public class kh12 {
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
