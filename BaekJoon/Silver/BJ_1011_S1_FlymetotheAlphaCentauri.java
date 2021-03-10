package com.ssafy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BJ_1011_S1_FlymetotheAlphaCentauri {

	static long start, end;
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(bf.readLine());

		for(int tc=1; tc<=testCase; tc++) {
			String [] tmp = bf.readLine().split(" ");
			start = Long.parseLong(tmp[0]);
			end = Long.parseLong(tmp[1]);
			end -= start;
			start -= start;
			long count = warp();
			
			System.out.println(count+1);
		}
	}

	private static long warp() {
		Queue<long[]> q = new LinkedList<>();
		long [] hop = new long[3];
		
		hop[0] = start;
		hop[1] = 0;
		hop[2] = 0;
		q.offer(hop);
		
		while(!q.isEmpty()) {
			long cur[] = q.poll();
			long [][] next = new long[3][3];
			next[0][0] = cur[0] + cur[1] - 1;
			next[0][1] = cur[1] - 1;
			next[0][2] = cur[2] + 1;
			next[1][0] = cur[0] + cur[1];
			next[1][1] = cur[1];
			next[1][2] = cur[2] + 1;
			next[2][0] = cur[0] + cur[1] + 1;
			next[2][1] = cur[1] + 1;
			next[2][2] = cur[2] + 1;
			for(int i=0 ; i<3; i++) {
				if(next[i][0] <= start || next[i][0] >= end)
					continue;
				if(next[i][0] == end-1)
					return next[i][2];
				System.out.println("next = " +next[i][0]);
				q.offer(next[i]);
			}
		}
		return 0;
	}
}
