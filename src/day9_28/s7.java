package day9_28;

import java.util.Scanner;

/**
 * ʵ��������ϵͳ
 * 
 * @author WangXin
 *
 */

public class s7 {
	public static void main(String[] args) {
		Scanner input = new  Scanner(System.in);
		 System.out.print("���������:");
		int year = input.nextInt();
		System.out.print("�������·�:");
		int month = input.nextInt();
		if(year < 1){
			System.out.println("��������ȷ����ݣ�");
		}
		else if(month < 1 || month > 12){
			System.out.println("��������ȷ���·ݣ�");
		}
		
		System.out.println("-------" + year + " �� " + month + " �� " + "-------");
        System.out.println();
        System.out.println("��      һ       ��       ��       ��       ��       ��");
		
		//���㵱ǰ�����ǰ��������beforeYearTotalDay;ÿ4��һ������,����366��,ƽ��365��
        int beforeYearTotalDay = ((year - 1) / 4 * 366) + (year-1 - ((year - 1) / 4)) * 365;
        int[] arrLeapYear = {0,31,29,31,30,31,30,31,31,30,31,30,31};    //�����������  
        int[] arrNormalYear = {0,31,28,31,30,31,30,31,31,30,31,30,31};    //ƽ��������� 
        int beforeMonthTotalDay = 0;                                    //���屾�굱��֮ǰ�·ݵ�������
        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {    //�жϵ�ǰ����Ƿ�������
            for (int i = 0 ; i < month ; i ++ ) {    //���㵱��֮ǰ������
                //���㵱ǰ�·�֮ǰ����������
                beforeMonthTotalDay = beforeMonthTotalDay + arrLeapYear[i];
            }
            //�жϵ���1�������ڼ�
            int totalDay = beforeYearTotalDay + beforeMonthTotalDay + 1;
            int week = totalDay % 7;//��֪1��1��1����������,��ģ7��1��Ӧ����������
            for (int i = 0 ; i < (week - 1 + 7) % 7 ; i ++) {    //���д��i < (week-1)�����i<-1�����
                System.out.print("    ");//�����ͷ�հ�
            }
            for (int i = 1 ;i <= arrLeapYear[month] ;i ++ ) {    //forѭ�������������
                System.out.print(i + "  ");
                if (i < 10 ) {        //С��10������һ���ո�,�Ա��ӡ����
                    System.out.print(" ");
                }
                if (i % 7 == ((7-(week - 1)) % 7 ) || i == arrLeapYear[month]) {//ÿ��������/β������
                    System.out.println();
                }
            }
 
        } else {        //�����������ƽ��
            for (int i = 0 ; i < month ; i ++ ) {    //forѭ�����������֮ǰ�·�������
                beforeMonthTotalDay = beforeMonthTotalDay + arrNormalYear[i];
            }
            //�жϵ���1�������ڼ�
            int totalDay = beforeYearTotalDay + beforeMonthTotalDay + 1;
            int week = totalDay % 7;//��֪1��1��1����������,��ģ7��1��Ӧ����������
            for (int i = 0 ; i < (week - 1 + 7) % 7 ; i ++) {    //���д��i < (week-1)�����i<-1�����
                System.out.print("    ");//�����ͷ�հ�
            }
            for (int i = 1 ;i <= arrNormalYear[month] ;i ++ ) {//forѭ�������������
                System.out.print(i + "  ");
                if (i < 10 ) {            //С��10������һ���ո�,�Ա��ӡ����
                    System.out.print(" ");
                }
                if (i % 7 == ((7-(week - 1)) % 7 ) || i == arrNormalYear[month]) {//ÿ��������/β������
                    System.out.println();
                }
            }
        }
		input.close();
		
	}

}
