package kh07;
/**
 * 用三种嵌套循环描述:每天吃三餐饭  每次吃10口
	第一餐：
		第一口
		第二口
		。。。。
	第二餐：
		第一口
		第二口
		。。。。
	第三餐：
		第一口
		第二口
		。。。。

 * @author WangXin
 *
 */
public class sj01 {
	public static void main(String[] args) {
		//java循环有for,while,do-while
		//1.for循环实现
		for(int i=0;i<3;i++){
			System.out.println("第"+(i+1)+"餐：");
			for(int j=0;j<10;j++){
				System.out.println("         第"+(j+1)+"口");
			}
			
		}
		
		System.out.println("-----------------------------------");
		//2.while循环实现
		int i=1;
		while(i<=3){
			System.out.println("第"+i+"餐：");
			int j=1;
			while(j<=10){
				System.out.println("         第"+j+"口");
				j++;
			}
			i++;
		}
		
		System.out.println("-----------------------------------");
		
		//3.do-while循环实现
		int x=1;
		do{
			System.out.println("第"+x+"餐：");
			int y=1;
			do{
				System.out.println("         第"+y+"口");
				y++;
			}while(y<=10);
			x++;
		}while(x<=3);
	}

}





















