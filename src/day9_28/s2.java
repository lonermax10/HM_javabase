package day9_28;
/**
 * 定义长度为4 的整型数组 
	给每个元素分别赋值一个数字
	将第一个元素与最后一个元素相加 并显示结果
	将第二个元素与第三个元素相加 并显示结果
	注意索引不可越界

 * @author WangXin
 *
 */

public class s2 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int sum1 = a[0] + a[3];
		int sum2 = a[1] + a[2];
		System.out.println("第一个元素与最后一个元素相加:" + sum1);
		System.out.println("将第二个元素与第三个元素相加:" + sum2);
		
	}

}
