package day9_28;

/**
 * 声明一个char型的数组，在此数组的单元格中分别放入"我爱你"三个字符，然后使用循环将它反序输出。如"你爱我"。（从最后一个元素循环到第一个元素）
 * 
 * @author WangXin
 *
 */

public class kh5 {
	public static void main(String[] args) {
		char[] a = { '我', '爱', '你' };
		
		for (int i = 0; i < a.length; i++) {
			
			char value = a[a.length - (i + 1)];
			
			System.out.print(value + "\t");
		}
	}

}
