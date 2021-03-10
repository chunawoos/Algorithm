package com.ssafy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_1010_S5_다리놓기 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		long [] fact = new long[21];
		fact[0] = 1;
		fact[1] = 1;
		for(int i=2; i<21 ;i++) {
			fact[i] = fact[i-1]*i;
		}
		int testCase = Integer.parseInt(bf.readLine());
		
		for(int tc=1; tc<=testCase; tc++) {
			String [] tmp = bf.readLine().split(" ");
			int left = Integer.parseInt(tmp[0]);  // R
			int right = Integer.parseInt(tmp[1]); // N
			long cnt = 1;
			for(int i=0; i<left; i++) {  // N! / (N-R)!
				cnt *=(right-i);
			}
			if(left <= 20) {      // N! / R! * (N-R)!
				cnt /= fact[left]; // 미리 저장해 놓았던 팩토리얼
			} else {
				cnt /= fact[left];
				for(int i=21; i<= left; i++) { // 저장하지 못한 팩토리얼 처리
					cnt /= i;
				}
			}
			System.out.println(cnt);
		}
	}
}