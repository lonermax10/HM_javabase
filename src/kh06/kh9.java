package kh06;

import java.util.Random;

/**
 * 使用循环与break实现：循环显示10个0-20之间的随机数，若遇到0 则退出循环
 * 
 * @author WangXin
 *
 */
public class kh9 {
	public static void main(String[] args) {
		Random r=new Random();
		for(int i=0;i<10;i++){
			int num=r.nextInt(20);
			System.out.println(num);
			if(num==0){
				break;
			}
			
		}
	}

}
