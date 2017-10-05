package kh06;
/**
 * 计算1+2+3+4+5...+10  的累加和，当累加和超过20的时候，推出循环，问此时的数字是多少？
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
