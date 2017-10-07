package kh06;
/**
 * 循环产生10个100以内随机数，统计这10个整数中有多少个偶数。（for实现）
 * 
 * @author WangXin
 *
 */
public class kh7 {
	public static void main(String[] args) {
		int sumO=0;
		int sumJ=0;
		//产生随机数
		
		for(int i=0;i<10;i++){
			int num=(int)(Math.random()*100);
			if(num%2==0){
				sumO++;
			}else if(num%2!=0){
				sumJ++;
			}
			System.out.println(num);
			
		}
		System.out.println("偶数和"+sumO);
		System.out.println("奇数和"+sumJ);
	}

}
