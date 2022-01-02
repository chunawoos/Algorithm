package com.ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1032_B1_명령프롬프트 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		char[] array = bf.readLine().toCharArray();
		int len = array.length;
		
		for (int i = 1; i < N; i++) {
			String comp = bf.readLine();
			for (int j = 0; j < len; j++) {
				if(array[j] != comp.charAt(j)) {
					array[j] = '?';
				}
			}
		}
		
		String ans = "";
		
		for (int i = 0; i < len; i++) {
			ans += array[i];
		}
		System.out.println(ans);
	}
}
