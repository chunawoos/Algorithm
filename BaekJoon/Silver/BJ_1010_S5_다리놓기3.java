package com.ssafy;

import java.util.Scanner;

public class BJ_1010_S5_다리놓기3 {

	static int N,R;
	static int[] p;
	static long totalCount;
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int tc=1; tc<=testCase; tc++) {
			
			R = sc.nextInt();
			N = sc.nextInt();
			p = new int[N];
			totalCount = 0 ;
			
			int cnt=0;
//			if(R > N/2)    // nCr = nCn-r
//				R = N-R;
			while(++cnt<=R) {
				p[N-cnt] = 1;
			}
			while(np(p)) {	}
			System.out.println(totalCount);
		}
		sc.close();
	}
	
	private static boolean np(int numbers[]) {
		totalCount++;
		int i=N-1;
		while(i>0 && numbers[i-1]>=numbers[i]) --i;  
		if(i==0) return false;
		
		int j=N-1;
		while(numbers[i-1]>=numbers[j])	--j;  
		swap(numbers,i-1,j);
		
		int k = N-1;
		while(i<k) {
			swap(numbers,i++,k--);			
		}
		return true;
		
	}
	
	private static void swap(int numbers[],int i,int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
}