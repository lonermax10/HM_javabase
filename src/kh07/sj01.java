package kh07;
/**
 * ������Ƕ��ѭ������:ÿ������ͷ�  ÿ�γ�10��
	��һ�ͣ�
		��һ��
		�ڶ���
		��������
	�ڶ��ͣ�
		��һ��
		�ڶ���
		��������
	�����ͣ�
		��һ��
		�ڶ���
		��������

 * @author WangXin
 *
 */
public class sj01 {
	public static void main(String[] args) {
		//javaѭ����for,while,do-while
		//1.forѭ��ʵ��
		for(int i=0;i<3;i++){
			System.out.println("��"+(i+1)+"�ͣ�");
			for(int j=0;j<10;j++){
				System.out.println("         ��"+(j+1)+"��");
			}
			
		}
		
		System.out.println("-----------------------------------");
		//2.whileѭ��ʵ��
		int i=1;
		while(i<=3){
			System.out.println("��"+i+"�ͣ�");
			int j=1;
			while(j<=10){
				System.out.println("         ��"+j+"��");
				j++;
			}
			i++;
		}
		
		System.out.println("-----------------------------------");
		
		//3.do-whileѭ��ʵ��
		int x=1;
		do{
			System.out.println("��"+x+"�ͣ�");
			int y=1;
			do{
				System.out.println("         ��"+y+"��");
				y++;
			}while(y<=10);
			x++;
		}while(x<=3);
	}

}





















