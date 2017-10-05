package day9_26;
/**
 * 定义一个整形变量比如:int a = 12345;然后依次输出各个位上的数字；
 * 
 * @author WangXin
 *
 */

public class b9 {
	public static void main(String[] args) {
		int a = 12345;
		
		int gewei = a %10;
		int shiwei = a / 10 % 10;
		int baiwei = a / 100 %10;
		int qianwei = a / 1000 % 10;
		int wanwei = a/ 10000 %10;
		
		System.out.println("万\t"+"千\t"+ "百\t"+"十\t" + "个");
		System.out.println(wanwei +"\t"+qianwei +"\t"+baiwei+"\t"+shiwei+"\t"+gewei);
	}

}
