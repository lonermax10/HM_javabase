package kh06;
/**
 * ��ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ�������
 * ���磺153��һ��"ˮ�ɻ���"����Ϊ153=1�����η���5�����η���3�����η���
 * 
 * @author WangXin
 *
 */
public class kh1 {
	public static void main(String[] args) {
		for(int i=0;i<1000;i++){
			int gewei=i%10;
			int shiwei=(i/10)%10;
			int baiwei=(i/100)%10;
			int Lge=gewei*gewei*gewei;
			int Lshi=shiwei*shiwei*shiwei;
			int Lbai=baiwei*baiwei*baiwei;
			if((Lge+Lshi+Lbai)==i){
				System.out.println(i);
			}
		}
	}

}
