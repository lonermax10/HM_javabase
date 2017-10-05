package kh05;
/**
 * 计算1+3+5+7.......+99的和
 * @author WangXin
 *
 */

public class kh6 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i =1;i < 100;i++){
			if(i%2!=0){
				System.out.println(i);
				sum+=i;
				
			}

		}
		System.out.println("和"+sum);
	}

}
