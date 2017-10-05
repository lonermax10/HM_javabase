package kh05;
/**
 * 2006年培养学员8万人，每年增长25%，请问按此增长速度，到哪一年培训学员人数将达到20万人？do{}while();实现
 * 
 * @author WangXin
 *
 */

public class sj4 {
	public static void main(String[] args) {
		double people = 8;
		int year = 2006;
		do{
			people = people * (1+0.25);
			year++;
		}while(people<=20);
		
		System.out.println(year + "年，到达20万人。 ");
	}

}
