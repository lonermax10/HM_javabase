package day9_28;
/**
 * ����һ��int�͵����飬ѭ���������13��1��13֮����������뵽��������ȥ����ѭ�������
 * 
 * @author WangXin
 *
 */

public class kh4 {
	public static void main(String[] args) {
		int[] a = new int[13];
		for(int i = 0; i < a.length; i++){
			a[i] = (int)(Math.random() * 13)+1;	  //����1--13�����
		}
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + "\t");	
		}
	}

}
