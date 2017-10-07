package kh06;

public class kh3_1 {
	public static void main(String[] args) {
		
			java.util.Scanner s = new java.util.Scanner(System.in);
			int in = s.nextInt();
			int max = in;
			int min = in;
			while(in != 0){
				in = s.nextInt();
				if(in > max)
					max = in;
				else if(in<min)
					min = in;
			}
			System.out.println("max="+max+",min="+min);
	}
}