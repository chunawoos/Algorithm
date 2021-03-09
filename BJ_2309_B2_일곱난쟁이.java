package com.ssafy;

import java.util.PriorityQueue;
import java.util.Scanner;

public class BJ_2309_B2_일곱난쟁이 {
	private static int[] dwarf;
	static boolean [] real;
	static boolean isFind;
	static PriorityQueue<WhiteSnow> pq;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		dwarf = new int[9];
		real = new boolean[9];
		isFind = false;
		for (int i = 0; i < 9; i++) {
			dwarf[i]= sc.nextInt();
		}
		pq = new PriorityQueue<>();
		powerSet(0,0,0);
		while(!pq.isEmpty()) {
			System.out.println(pq.poll().cnt);
		}
	}
	private static void powerSet(int depth, int cnt, int sum) {
		if(isFind) return;
		if(cnt == 7) {
			if(sum == 100) {
				for (int i = 0; i < 9; i++) {
					if(real[i]) 
						pq.offer(new WhiteSnow(i, dwarf[i]));
					isFind = true;
				}
				return;
			}
		}
		if(depth == 9) return;
		real[depth] = true;
		powerSet(depth+1, cnt+1, sum+dwarf[depth]);
		real[depth] = false;
		powerSet(depth+1, cnt, sum);
		
	}
	static class WhiteSnow implements Comparable<WhiteSnow>{
		int num;
		int cnt;
		public WhiteSnow(int num, int cnt) {
			super();
			this.num = num;
			this.cnt = cnt;
		}
		@Override
		public int compareTo(WhiteSnow o) {
			return this.cnt-o.cnt;
		}
		
	}
}
