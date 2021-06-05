package com.ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sw_11736_D3_평범한숫자 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(bf.readLine());
			int[] seq = new int[N];
			StringTokenizer st = new StringTokenizer(bf.readLine());
			
			for (int i = 0; i < N; i++) {
				seq[i] = Integer.parseInt(st.nextToken());
			}
			
			int cnt = 0;
			
			for (int i = 1; i < N-1; i++) {
				int max = seq[i] > seq[i-1] ? seq[i] > seq[i+1] ? seq[i] : seq[i+1] : seq[i-1]; 
				int min = seq[i] < seq[i-1] ? seq[i] < seq[i+1] ? seq[i] : seq[i+1] : seq[i-1];
				if(seq[i] == max || seq[i] == min) continue;
				cnt++;
			}
			sb.append("#").append(tc).append(" ").append(cnt).append("\n");
		}
		System.out.println(sb);
	}
}
