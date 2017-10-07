package kh06;
/**
 * 使用do while循环 累加计算 100以内的奇数和
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
				System.out.println("奇数是："+i);
				System.out.println(sum);
			}
		}while(i<100);
		System.out.println("和"+sum);
	}

}
