package day9_28;
/**
 * ���峤��Ϊ10 ����������  ѭ����10��0-100���������ֵ�������鲢��ʾ  ����ʾ������ż���������ͳ�������ĸ�����ż���ĸ�����0�ĸ���	
 * 
 * @author WangXin
 *
 */

public class s5 {
	public static void main(String[] args) {
		int[] a = new int[10];
		for(int i = 0; i < a.length; i++){
			a[i] = (int)(Math.random()*100);  //���������,math.radom()
			System.out.println(a[i]);
		}
		
		int jishu = 0;
		int sumJ = 0;
		int oushu = 0;
		int sumO = 0;
		int zero = 0;
		
		for(int j = 0; j < a.length; j++){
			if(a[j] % 2 == 0){
				sumO += a[j];
				oushu++;
				
			}
			else if(a[j] % 2 == 1){
				sumJ += a[j];
				jishu++;
			}
			else if(a[j] == 0){
				zero++;
			}
			
		}
		System.out.println("ż���ͣ�" + sumJ +"ż��������" + oushu);
		System.out.println("�����ͣ�" + sumO +"����������" + jishu);
		System.out.println("0�ĸ�����" + zero);
	}

}
