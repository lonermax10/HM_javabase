package kh05;
/**
 * 循环输出200到1000之间，
   只要能被5整除，或则能被8整除的数。

 * @author WangXin
 *
 */
public class kh7 {
	public static void main(String[] args) {
		for(int i=200; i<1000; i++){
			if(i%5==0||i%8==0){
				System.out.println(i);
			}
		}
	}

}
