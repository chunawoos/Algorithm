package com.ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2156_S1_포도주시식 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int [] wine = new int[N+1];
		for (int i = 1; i <= N; i++) {
			wine[i] = Integer.parseInt(bf.readLine());
		}
		int [][] D = new int[N+1][3];
		D[1][1] = wine[1];
		for (int i = 2; i <= N; i++) {
			D[i][0] = Math.max(D[i-1][0], Math.max(D[i-1][1],D[i-1][2]));
			D[i][1] = Math.max(D[i-2][0], Math.max(D[i-2][1], Math.max(D[i-2][2], D[i-1][0]))) + wine[i];
			D[i][2] = D[i-1][1] + wine[i];
		}
		int res  = Math.max(D[N][2], Math.max(D[N][1], D[N][0]));
		System.out.println(res);
	}
}
