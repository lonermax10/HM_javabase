package kh05;
/**
 * 2006������ѧԱ8���ˣ�ÿ������25%�����ʰ��������ٶȣ�����һ����ѵѧԱ�������ﵽ20���ˣ�do{}while();ʵ��
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
		
		System.out.println(year + "�꣬����20���ˡ� ");
	}

}
