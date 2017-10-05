package kh05;
/**
 * 循环输出100到200之间所有能被2和3整除的数。
 * 
 * @author WangXin
 *
 */

public class kh5 {
	public static void main(String[] args) {
		for(int i =100;i <= 200;i++){
			if(i%2==0&&i%3==0){
				System.out.println(i);
			}
			
		}
	}

}
