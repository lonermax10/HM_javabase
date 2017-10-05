package day9_28;
/**
 * 定义长度为10 的整型数组  循环将10个0-100的随机数赋值给该数组并显示  并显示奇数或偶数并在最后统计奇数的个数与偶数的个数，0的个数	
 * 
 * @author WangXin
 *
 */

public class s5 {
	public static void main(String[] args) {
		int[] a = new int[10];
		for(int i = 0; i < a.length; i++){
			a[i] = (int)(Math.random()*100);  //产生随机数,math.radom()
			System.out.println(a[i]);
		}
		
		int jishu = 0;
		int sumJ = 0;
		int oushu = 0;
		int sumO = 0;
		int zero = 0;
		
		for(int j = 0; j < a.length; j++){
			if(a[j] % 2 == 0){
				sumO += a[j];
				oushu++;
				
			}
			else if(a[j] % 2 == 1){
				sumJ += a[j];
				jishu++;
			}
			else if(a[j] == 0){
				zero++;
			}
			
		}
		System.out.println("偶数和：" + sumJ +"偶数个数：" + oushu);
		System.out.println("奇数和：" + sumO +"奇数个数：" + jishu);
		System.out.println("0的个数：" + zero);
	}

}
