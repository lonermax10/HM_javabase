package kh06;
/**
 * 使用循环与continue实现：一个月30天，从1号开始每天学习，但每到了第7天则跳过，在控制台输出这是第几天的学习。
 * 
 * @author WangXin
 *
 */
public class kh8 {
	public static void main(String[] args) {
		for(int i=1;i<=30;i++){
			if(i%7==0){
				System.out.println(i+1);
				continue;
			}
		}
	}

}
