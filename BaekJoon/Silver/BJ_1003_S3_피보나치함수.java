package com.ssafy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_1003_S3_피보나치함수 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		long [] fib = new long[41];
		fib[1] = 1;
		for (int i = 2; i <= 40; i++) {
			fib[i] = fib[i-1] + fib[i-2];
		}
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(bf.readLine().trim());
			long zCnt = 0;
			long oCnt = 0;
			if(N == 0) {
				zCnt = 1;
			} else if (N == 1) {
				oCnt = 1;
			} else if (N== 2) {
				oCnt = 1;
				zCnt = 1;
			} else  {
				oCnt = fib[N];
				zCnt = fib[N-1];
			}
			System.out.println(zCnt+" "+oCnt);
		}
	}
}
