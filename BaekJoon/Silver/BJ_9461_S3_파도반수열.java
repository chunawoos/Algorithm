package com.ssafy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_9461_S3_파도반수열 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(bf.readLine());
			long [] D = new long[N+1];
			if(N >= 1) D[1] = 1;
			if(N >= 2) D[2] = 1;
			if(N >= 3) D[3] = 1;
			if(N >= 4) D[4] = 2;
			if(N >= 5) D[5] = 2;
			if(N >= 6) {
				for (int i = 6; i <= N; i++) {
					D[i] = D[i-1] + D[i-5];
				}
			}
			System.out.println(D[N]);
		}
	}
}
