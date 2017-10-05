package kh05;

import java.util.Scanner;

/**
 * 苦练半年，眼看大赛在即，盈盈提议：彩排一次，如果很令人满意，以后就不用彩排了，否则每天都要彩排，直到现场表现让她满意为止！ 
 * 
 * @author WangXin
 *
 */

public class sj5 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		String ch;
		do{
			System.out.println("彩排！");
			
			ch = input.nextLine();
		}while(ch != "y" || ch != "Y");
		System.out.println("满意");
		input.close();
	}

}
