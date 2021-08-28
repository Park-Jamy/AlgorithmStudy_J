package Q0823_08229;

import java.io.*;
import java.util.*;

public class Q1920 {
	//21.08.28 백준 1920  https://www.acmicpc.net/problem/1920

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException{
		int count = Integer.parseInt(br.readLine());
		String s[] = br.readLine().split(" ");
		int A[] = new int[count];
		
		for(int i = 0; i < count; i++) A[i] = Integer.parseInt(s[i]);
		
		int count1 = Integer.parseInt(br.readLine());
		String s1[] = br.readLine().split(" ");
		int A1[] = new int[count1];
		
		
		
		
		for(int i = 0; i < count1; i++) {
			A1[i] = 0;
			int now = Integer.parseInt(s1[i]);
			
			for(int j = 0; j < count; j++) {
				if(now == A[j]) A1[i] = 1;
			}
			
			bw.write(A1[i] + " ");
		}
		bw.flush();
		bw.close();
		
		
	}
}

// 이진트리 검색 이진탐


//public static int binarySearch(int key) {
//	 
//	int lo = 0;					// 탐색 범위의 왼쪽 끝 인덱스
//	int hi = arr.length - 1;	// 탐색 범위의 오른쪽 끝 인덱스
//
//	// lo가 hi보다 커지기 전까지 반복한다.
//	while(lo <= hi) {
//
//		int mid = (lo + hi) / 2;	// 중간위치를 구한다.
//
//		// key값이 중간 위치의 값보다 작을 경우
//		if(key < arr[mid]) {
//			hi = mid - 1;
//		}
//		// key값이 중간 위치의 값보다 클 경우
//		else if(key > arr[mid]) {
//			lo = mid + 1;
//		}
//		// key값과 중간 위치의 값이 같을 경우
//		else {
//			return mid;
//		}
//	}
//
//	// 찾고자 하는 값이 존재하지 않을 경우
//	return -1;
//
//}
