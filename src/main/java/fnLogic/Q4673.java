package fnLogic;

import java.io.*;

public class Q4673 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 21.07.24 백준 4673 https://www.acmicpc.net/problem/4673		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int arr[] = new int[10001];
		
		for(int i = 1; i <= 10000; i++ ) {
			int a = check(i);
			
			if(a <= 10000) arr[a] = 1;
		}
		int n = 1;
		while(n < 10001) {
			if(arr[n] == 0) bw.write(n + "\n");
			n++;
		}
	    bw.close();
	}
	
	public static int check(int a) {
	    
	    int sum = a;
	    while(true) {
	    	sum += a%10;
	    	a = a/10;
	    	if(a == 0) break;
	    }
	    
        return sum;
    }
}
