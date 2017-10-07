package kh06;
/**
 * 使用for循环与break语句实现：从1一直加到100,但如果累加的和大于500也要结束循环，并输出此时已经加到的数是什么？
 * 
 * @author WangXin
 *
 */
public class sj5 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++){
			sum+=i;
			if(sum>500){
				break;
			}
		}
		System.out.println(sum);
	}

}
