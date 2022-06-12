package gfg;
import java.util.*;
public class egg {
	static final int max = 1000;
	static int dp[][]=new int[max][max];
	static int eggdrop(int n, int floor) {
		if(dp[n][floor]!=-1) {
			return dp[n][floor];
		}
		 if (floor == 1 || floor == 0)
	            return floor;
	 
	        if (n == 1)
	            return floor;
	 
	        int min = Integer.MAX_VALUE;
	        int res;
	        for (int i = 1; i <= floor; i++) {
	            res = Math.max(eggdrop(n - 1, i - 1),
	                           eggdrop(n, floor - i));
	            if (res < min)
	                min = res;
	        }
	 
	        dp[n][floor] = min + 1;
	        return min + 1;
	    }
	public static void mian(String args[]) {
		Scanner sc = new Scanner(System.in);
		 for (int i = 0; i < dp.length; i++)
	            Arrays.fill(dp[i], -1);
	        int n = sc.nextInt(), floor = sc.nextInt();
	        System.out.print(eggdrop(n, floor));
	    }
	}
	
			
	


