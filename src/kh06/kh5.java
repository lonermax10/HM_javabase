package kh06;
/**
 * ʹ��do whileѭ�� �ۼӼ��� 100���ڵ�������
 * 
 * @author WangXin
 *
 */
public class kh5 {
	public static void main(String[] args) {
		int i=0;
		int sum=0;
		
		do{
			i++;
			if(i%2!=0){
				sum+=i;
				System.out.println("�����ǣ�"+i);
				System.out.println(sum);
			}
		}while(i<100);
		System.out.println("��"+sum);
	}

}
