package kh06;

import java.util.Random;

/**
 * ʹ��ѭ����breakʵ�֣�ѭ����ʾ10��0-20֮����������������0 ���˳�ѭ��
 * 
 * @author WangXin
 *
 */
public class kh9 {
	public static void main(String[] args) {
		Random r=new Random();
		for(int i=0;i<10;i++){
			int num=r.nextInt(20);
			System.out.println(num);
			if(num==0){
				break;
			}
			
		}
	}

}
