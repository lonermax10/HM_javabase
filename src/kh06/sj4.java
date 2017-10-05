package kh06;

import java.util.Scanner;

/**
 * 循环100次“我爱你，你爱我吗？”，直到对方说爱，就结束循环
 * 
 * @author WangXin
 *
 */
public class sj4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("你爱我吗？");
		String love =input.next();
		
		if(love.equals("爱")){
			for(int i=0;i<100;i++){
				System.out.println("我也爱你");
				
			}
		}else{
			System.out.println("我也不爱你！");
		}
		input.close();
	}

}
