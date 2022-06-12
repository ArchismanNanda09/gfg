package gfg;
import java.util.*;
public class PAIR {
	static int[] pair(int a[], int n, int x) {
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		int arr[]= {0,0};
		for(int i=0;i<n;i++) {
			int element = x-a[i];
			if(m.containsKey(element)) {
				arr[0]=i-1;
				arr[1]=m.get(element)-1;
				break;
			}
			else {
				m.put(a[i],i);
			}
			
		}
		return arr;
	}
	public static void main(String[] args)
	  {
	    int A[] = {1,5,4,3,7,9,2};
	    int n = A.length;
	    int search = 7;
	    int ans[] = pair(A,n,search);
	    System.out.println(Math.min(ans[0], ans[1]) + " " +Math.max(ans[0], ans[1]));
	  }
	}