package kh07;
/**
 * 使用三种循环实现：
	*******
	*******
	*******

 * @author WangXin
 *
 */
public class sj02 {
	public static void main(String[] args) {
		//1.for循环实现
		for(int i=0;i<3;i++){
			System.out.println("*******");
		}
		
		System.out.println("------------------");
		
		//2.while循环实现
		int i=0;
		while(i<3){
			System.out.println("*******");
			i++;
		}
		
		
		System.out.println("------------------");
		
		//3.do-while循环实现
		int j=0;
		do{
			System.out.println("*******");
			j++;
		}while(j<3);
		
		
		
		
		
		System.out.println("------------------");
	}

}
