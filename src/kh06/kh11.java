package kh06;
/**
 * һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻�����£������ڵ�10�����ʱ�������������ף���10�η�����ߣ�(�ó���ʵ��)
 * 
 * @author WangXin
 *
 */
public class kh11 {
	public static void main(String[] args) {
		double h=100;
		double sumH=0;
		for(int i=0;i<10;i++){
			h=h/2;
			System.out.println();
			sumH+=h;
			System.out.println("�ܸ߶ȣ�"+sumH*2);
		}
	}

}
