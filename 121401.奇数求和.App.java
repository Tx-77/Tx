import java.util.Iterator;

public class TxlxSum {
	static long sum=0;
	public static void main(String[] args) {
		for (long i = 0; i < 2147483647; i++) {
			if (i%2!=0) {
				sum=sum+i;
				
			}
		}
		System.err.println(sum);
	}

}
