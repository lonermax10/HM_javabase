package kh06;
/**
 * ����1+2+3+4+5...+10  ���ۼӺͣ����ۼӺͳ���20��ʱ���Ƴ�ѭ�����ʴ�ʱ�������Ƕ��٣�
 * 
 * @author WangXin
 *
 */
public class sj2 {
	public static void main(String[] args) {
		int sum=0;
		for(int i = 1; i<=10; i++){
			sum+=i;
			if(sum>20){
				System.out.println(i);
				break;
				
			}
			
		}
		System.out.println(sum);
		
	}

}
