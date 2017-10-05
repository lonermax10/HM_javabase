package day9_26;
/**
 * 定义一个变量记录天数=10，计算10天共有多少小时。多少分钟。
	天	小时	分钟
	10	**** 	****
	关键：\t
 * @author WangXin
 *
 */

public class b4 {
	public static void main(String[] args) {
		int day =10;
		int hour = day*24;
		int min = hour*60;
		System.out.println("天\t" + "小时\t" + "分钟");
		System.out.println(day+"\t"+hour+"\t"+min);
	}

}
