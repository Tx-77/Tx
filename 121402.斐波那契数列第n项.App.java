import java.util.Scanner;

import javax.swing.text.Style;


public class TxlxPBNQS {
	
	public static int getSum(int n) {
		if (n == 1 || n == 2) {		// 如果n为1 返回1
			return 1;
		} else {		//否则返回n-1与n-2的数值的相加
			return getSum(n - 1) + getSum(n - 2);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		if (user <= 40) {
			for (int i = 1; i <= user; i++) {// 循环
			}			
		}
		System.out.println("第"+user+"项为："+getSum(user));
	}
		
}
