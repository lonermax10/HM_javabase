package day9_26;
/**
 * ����һ��������¼Ӳ�̵Ĵ�С����1GB,��ô�������Ӳ���ж���MB��
   �ж���KB���ж���Byte��
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
