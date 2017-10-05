package day9_28;
/**
 * 声明一个字符串的数组，空间为5个。将第一个空间的值设置为“张三”，第二个空间的值为“李四”，第三个空间的值为“王二”，
 * 第四个空间的值为“麻子”，第五个空间的值为“小红”。然后再输出所有空间中的值。
 * 
 * @author WangXin
 *
 */

public class kh1 {
	public static void main(String[] args) {
		String[] name = {"张三","李四","王二","麻子","小红"};
		for(int i = 0; i< name.length; i++){
			System.out.print(name[i] + "\t");
		}
	}

}
