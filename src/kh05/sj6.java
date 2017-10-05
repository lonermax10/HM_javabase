package kh05;

import java.util.Scanner;

/**
 * 男孩子每天说完“我喜欢你”就问“你喜欢我吗？”如果那女孩子说“不喜欢”就接着循环说“我喜欢你”直到那女孩子说“喜欢”为止，就结束循环。
 * 
 * @author WangXin
 *
 */

public class sj6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String woman="不喜欢";
		//String woman;
		
		do{
			System.out.println("男：我喜欢你！");
			System.out.println("男：你喜欢我吗？");
			//String woman = input.next();
		}while(woman.equals(input.nextLine()));
		
		input.close();
		
	}

}
