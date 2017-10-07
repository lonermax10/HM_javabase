package kh06;
/**
 * 使用for循环，输出1900年到2012年中间所有的闰年！
 * 
 * @author WangXin
 *
 */
public class kh4 {
	public static void main(String[] args) {
		int i=0;
		
		for(int year=1900;year<=2012;year++){
			if((year%4==0&&year%100!=0)||year%400==0){
				i++;
				System.out.println(i);
				System.out.println(year);
			}
			
		}
	}

}
