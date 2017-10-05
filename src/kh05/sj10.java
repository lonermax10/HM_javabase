package kh05;
/**
 * 山上有一口缸可以装50升水,现在有15升水.
老和尚叫小和尚下山挑水,每次可以挑5升.
问:小和尚要挑几次水才可以把水港挑满?


 * @author WangXin
 *
 */

public class sj10 {
	public static void main(String[] args) {
		int water=35;
		for(int i=1; i<100&&water>0; i++){
			water=water-5;;
			
			System.out.println(i);
		}
	}

}
