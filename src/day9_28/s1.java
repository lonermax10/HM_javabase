package day9_28;
/**
 * 定义长度为4 的字符数组 默认值为 'a' 'c' 'c' 'p'
	显示该数组的 每一个元素:X[0] X[1] X[2] X[3]
	然后将值再次赋值为 'J' 'a' 'v' 'a'
	再显示 

 * @author WangXin
 *
 */

public class s1 {
	public static void main(String[] args) {
		char[] a = {'a' ,'c' ,'c' ,'p'};
		for(int i=0;i < a.length;i++){
			System.out.print(a[i]+"\t");
		}
		
		a[0] = 'j';
		a[1] = 'a';
		a[2] = 'v';
		a[3] = 'a';
		System.out.println("\n");
		for(int i=0;i < a.length;i++){
			System.out.print(a[i]+"\t");
		}
		
	}

}
