package com.ssafy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_2775_B2_부녀회장이될테야 {
	private static long[][] apt;

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(bf.readLine());
		
		for(int tc=1; tc<=testCase; tc++) {
			int floor = Integer.parseInt(bf.readLine());
			int room = Integer.parseInt(bf.readLine());
			apt = new long[floor+1][room+1];
			
			for(int i=1; i<=room; i++) {
				apt[0][i] = i;
			}
			
			for(int i=1; i<=floor; i++) {
				for(int j=1; j<=room;j++) {
					for(int k=1; k<=j; k++) {
						apt[i][j] += apt[i-1][k];
					}
				}
			}
			System.out.println(apt[floor][room]);
		}
	}

}
