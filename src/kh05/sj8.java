package kh05;
/**
 * ���10000-99999��������л�������
˵������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��
ABCBA

 * @author WangXin
 *
 */
public class sj8 {
	public static void main(String[] args) {
		for(int i=10000; i < 100000; i++){
			int gewei = i%10;
			int shiwei = (i/10)%10;
			int baiwei = (i/100) %10;
			int qianwei = (i/1000)%10;
			int wanwei = (i/10000) %10;
			if(gewei==wanwei && shiwei==qianwei && wanwei < qianwei && baiwei > qianwei){
				System.out.println(i);
			}
			
		}
	}

}
