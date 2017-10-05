package kh05;
/**
 * 2006年培养学员8万人，每年增长25%，请问按此增长速度，到哪一年培训学员人数将达到20万人？
 * @author WangXin
 *
 */

public class sj3 {
	public static void main(String[] args) {
		double people = 8;      //单位：万人
		int year = 2006;
		for(int i = 0; i< 100; i++){
			year++;
			people = people * (1+0.25);
			if(people > 20){
				System.out.println(year + "年，到达20万人。 ");
				break;
			}
		}
	}

}
/*
 * 2006    8
 * 2007    8+8*0.25=    10
 * 2008    10+10*0.25=    12.5
 * 2009    12.5+12.5*0.25=    15.625
 * 2010    15.625+15.625*0.25=    19.53125
 * 2011    19.53125+19.53125*0.25=    24.414
 * 
 * 
 * 
 * 
 * 
 * 
 * */


