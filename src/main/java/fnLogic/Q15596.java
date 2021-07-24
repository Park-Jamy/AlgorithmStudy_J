package fnLogic;

public class Q15596 {

	// 21.07.24 백준 15596 https://www.acmicpc.net/problem/15596
    long sum(int[] a) {
        long ans = 0;
        
        for(int i = 0; i < a.length; i++) {
		    ans += a[i];
	    }
        return ans;
    }
}
