package kh06;
/**
 * 打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
 * 
 * @author WangXin
 *
 */
public class kh1 {
	public static void main(String[] args) {
		for(int i=0;i<1000;i++){
			int gewei=i%10;
			int shiwei=(i/10)%10;
			int baiwei=(i/100)%10;
			int Lge=gewei*gewei*gewei;
			int Lshi=shiwei*shiwei*shiwei;
			int Lbai=baiwei*baiwei*baiwei;
			if((Lge+Lshi+Lbai)==i){
				System.out.println(i);
			}
		}
	}

}
