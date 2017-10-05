package day9_28;
/**
 * 声明一个int型的数组，循环随机生成13个1到13之间随机数放入到此数组中去，再循环输出。
 * 
 * @author WangXin
 *
 */

public class kh4 {
	public static void main(String[] args) {
		int[] a = new int[13];
		for(int i = 0; i < a.length; i++){
			a[i] = (int)(Math.random() * 13)+1;	  //生成1--13随机数
		}
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + "\t");	
		}
	}

}
