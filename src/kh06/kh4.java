package kh06;
/**
 * ʹ��forѭ�������1900�굽2012���м����е����꣡
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
