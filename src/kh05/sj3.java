package kh05;
/**
 * 2006������ѧԱ8���ˣ�ÿ������25%�����ʰ��������ٶȣ�����һ����ѵѧԱ�������ﵽ20���ˣ�
 * @author WangXin
 *
 */

public class sj3 {
	public static void main(String[] args) {
		double people = 8;      //��λ������
		int year = 2006;
		for(int i = 0; i< 100; i++){
			year++;
			people = people * (1+0.25);
			if(people > 20){
				System.out.println(year + "�꣬����20���ˡ� ");
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


