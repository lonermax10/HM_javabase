package day9_28;

import java.util.Scanner;

/**
 * ���峤��Ϊ5�ĸ����������ʾ���
	��ѭ����������ÿ��Ԫ�ظ�ֵ
	��ʾ�����ÿ��Ԫ��
	������ƽ�����


 * @author WangXin
 *
 */

public class s6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float[] h = new float[5];
		for(int i = 0; i < h.length; i++){
			System.out.print("�������" + (i+1) + "���˵���ߣ�");
			h[i] = input.nextFloat();
			
		}
		
		for(int i = 0; i < h.length; i++){
			System.out.print("��ߣ�" + h[i] + "\t");
		}
		input.close();
		
	}

}
