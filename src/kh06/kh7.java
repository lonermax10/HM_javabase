package kh06;
/**
 * ѭ������10��100�����������ͳ����10���������ж��ٸ�ż������forʵ�֣�
 * 
 * @author WangXin
 *
 */
public class kh7 {
	public static void main(String[] args) {
		int sumO=0;
		int sumJ=0;
		//���������
		
		for(int i=0;i<10;i++){
			int num=(int)(Math.random()*100);
			if(num%2==0){
				sumO++;
			}else if(num%2!=0){
				sumJ++;
			}
			System.out.println(num);
			
		}
		System.out.println("ż����"+sumO);
		System.out.println("������"+sumJ);
	}

}
