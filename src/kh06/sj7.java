package kh06;

import java.util.Scanner;

/**
 * 首先由电脑随机产生一个1到100(可以自己设置)的一个随机数，然后让玩家来猜，
如果猜大了，电脑就提示“大了”，如果猜小了，电脑就提示“小了”，
如果猜对了，电脑就提示“对了”则程序结束，否则继续猜。
 * @author WangXin
 *
 */
public class sj7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = (int)(Math.random()*100+1);
		
		for(int i=0;i<100;i++){
			System.out.println("请输入你猜的数字：");
			int guess =input.nextInt();
			if(guess>num){
				System.out.println("猜大了！");
				System.out.println("----------------");
			}else if(guess<num){
				System.out.println("猜小了！");
				System.out.println("----------------");
			}else if(guess==num){
				System.out.println("猜对了！");
				System.out.println("----------------");
				break;
			}
		}
		input.close();
	}

}
