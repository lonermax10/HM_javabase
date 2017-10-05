package kh05;

import java.util.Scanner;

/**
 * 输出“你爱我吗？”，接收回答。
   如果对方输入“爱”，就循环
   说“我也爱你”100次。
   否则就说：“我也不爱你”。

 * @author WangXin
 *
 */
public class kh12 {
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
