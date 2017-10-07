package kh06;
/**
 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？(用程序实现)
 * 
 * @author WangXin
 *
 */
public class kh11 {
	public static void main(String[] args) {
		double h=100;
		double sumH=0;
		for(int i=0;i<10;i++){
			h=h/2;
			System.out.println();
			sumH+=h;
			System.out.println("总高度："+sumH*2);
		}
	}

}
