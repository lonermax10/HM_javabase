package day9_26;
/**
 * ����һ�����α�������:int a = 12345;Ȼ�������������λ�ϵ����֣�
 * 
 * @author WangXin
 *
 */

public class b9 {
	public static void main(String[] args) {
		int a = 12345;
		
		int gewei = a %10;
		int shiwei = a / 10 % 10;
		int baiwei = a / 100 %10;
		int qianwei = a / 1000 % 10;
		int wanwei = a/ 10000 %10;
		
		System.out.println("��\t"+"ǧ\t"+ "��\t"+"ʮ\t" + "��");
		System.out.println(wanwei +"\t"+qianwei +"\t"+baiwei+"\t"+shiwei+"\t"+gewei);
	}

}
