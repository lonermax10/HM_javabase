package day9_28;

import java.util.Scanner;

/**
 * 实现万年历系统
 * 
 * @author WangXin
 *
 */

public class s7 {
	public static void main(String[] args) {
		Scanner input = new  Scanner(System.in);
		 System.out.print("请输入年份:");
		int year = input.nextInt();
		System.out.print("请输入月份:");
		int month = input.nextInt();
		if(year < 1){
			System.out.println("请输入正确的年份！");
		}
		else if(month < 1 || month > 12){
			System.out.println("请输入正确的月份！");
		}
		
		System.out.println("-------" + year + " 年 " + month + " 月 " + "-------");
        System.out.println();
        System.out.println("日      一       二       三       四       五       六");
		
		//计算当前年份以前所有天数beforeYearTotalDay;每4年一个闰年,闰年366天,平年365天
        int beforeYearTotalDay = ((year - 1) / 4 * 366) + (year-1 - ((year - 1) / 4)) * 365;
        int[] arrLeapYear = {0,31,29,31,30,31,30,31,31,30,31,30,31};    //闰年各月天数  
        int[] arrNormalYear = {0,31,28,31,30,31,30,31,31,30,31,30,31};    //平年各月天数 
        int beforeMonthTotalDay = 0;                                    //定义本年当月之前月份的总天数
        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {    //判断当前年份是否是闰年
            for (int i = 0 ; i < month ; i ++ ) {    //计算当月之前总天数
                //计算当前月份之前的所有天数
                beforeMonthTotalDay = beforeMonthTotalDay + arrLeapYear[i];
            }
            //判断当月1日是星期几
            int totalDay = beforeYearTotalDay + beforeMonthTotalDay + 1;
            int week = totalDay % 7;//已知1年1月1日是星期日,即模7得1对应的是星期日
            for (int i = 0 ; i < (week - 1 + 7) % 7 ; i ++) {    //如果写成i < (week-1)会出现i<-1的情况
                System.out.print("    ");//输出开头空白
            }
            for (int i = 1 ;i <= arrLeapYear[month] ;i ++ ) {    //for循环输出各月天数
                System.out.print(i + "  ");
                if (i < 10 ) {        //小于10的数补一个空格,以便打印整齐
                    System.out.print(" ");
                }
                if (i % 7 == ((7-(week - 1)) % 7 ) || i == arrLeapYear[month]) {//每逢星期六/尾数换行
                    System.out.println();
                }
            }
 
        } else {        //不是闰年就是平年
            for (int i = 0 ; i < month ; i ++ ) {    //for循环计算出当月之前月份总天数
                beforeMonthTotalDay = beforeMonthTotalDay + arrNormalYear[i];
            }
            //判断当月1日是星期几
            int totalDay = beforeYearTotalDay + beforeMonthTotalDay + 1;
            int week = totalDay % 7;//已知1年1月1日是星期日,即模7得1对应的是星期日
            for (int i = 0 ; i < (week - 1 + 7) % 7 ; i ++) {    //如果写成i < (week-1)会出现i<-1的情况
                System.out.print("    ");//输出开头空白
            }
            for (int i = 1 ;i <= arrNormalYear[month] ;i ++ ) {//for循环输出各月天数
                System.out.print(i + "  ");
                if (i < 10 ) {            //小于10的数补一个空格,以便打印整齐
                    System.out.print(" ");
                }
                if (i % 7 == ((7-(week - 1)) % 7 ) || i == arrNormalYear[month]) {//每逢星期六/尾数换行
                    System.out.println();
                }
            }
        }
		input.close();
		
	}

}
