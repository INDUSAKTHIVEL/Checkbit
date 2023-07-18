package Check_bit;

import java.util.Scanner;

public class Checkbit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m =sc.nextInt();
		int x = Bit(n,m);
	}

	private static int Bit(int n, int m) {
		if((n&(1<<m))!=0)
		{
			return 1;
		}
		else {
			return 0;
		}
		
	}
	

}
