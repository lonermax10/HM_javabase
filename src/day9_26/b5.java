package day9_26;
/**
 * 定义一个变量记录硬盘的大小，如1GB,那么计算这个硬盘有多少MB。
   有多少KB。有多少Byte。
	GB	MB	     KB	    Byte
	1	1024	*** *	****

 * @author WangXin
 *
 */

public class b5 {
	public static void main(String[] args) {
		int GB = 1;
		int MB = GB*1024;
		int KB = MB*1024;
		int Byte = KB*1024;
		
		System.out.println("GB\t"+"MB\t"+"KB\t"+"Byte");
		System.out.println(GB+"\t"+MB+"\t"+KB+"\t"+Byte);
		
		
	}

}
