package com.ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BJ_1021_S4_회전하는큐 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		List<Integer> q = new ArrayList<Integer>();
		int cnt = 0;
		
		for (int i = 1; i <= N; i++) {
			q.add(i);
		}
		
		st = new StringTokenizer(bf.readLine());
		int[] goal = new int[M];
		for (int i = 0; i < M; i++) {
			goal[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < M; i++) {
			while(q.get(0) != goal[i]) {
				int target = 0;
				int dir = 0;
				for (int j = 0; j < N; j++) {
					if(q.get(j) == goal[i]) {
						target = j;
						if(q.size()%2 == 0) {
							dir = target <= q.size()/2 - 1 ? 0 : 1;
						} else {							
							dir = target <= q.size()/2 ? 0 : 1;
						}
						break;
					}
				}
				switch(dir) {
				case 0:
					for (int j = 0; j < target; j++) {
						int tmp = q.remove(0);
						q.add(q.size(), tmp);
						cnt++;
					}
					break;
				case 1:
					for (int j = 0; j < q.size() - target; j++) {
						q.add(0, q.remove(q.size()-1));
						cnt++;
					}
					break;
				}
			}
			q.remove(0);
		}
		System.out.println(cnt);
	}
}
