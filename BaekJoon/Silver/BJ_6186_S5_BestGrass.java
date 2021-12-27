package com.ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_6186_S5_BestGrass {
	private static int row, col;
	private static boolean[][] map, visit;
	private static int[] dx = {-1, 1, 0, 0};
	private static int[] dy = {0, 0, -1, 1};

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());
		map = new boolean[row][col];
		visit = new boolean[row][col];
		int result = 0;
		
		for (int i = 0; i < row; i++) {
			String[] tmp = bf.readLine().split("");
			for (int j = 0; j < col; j++) {
				map[i][j] = tmp[j].charAt(0) == '.' ? false : true;
			}
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(map[i][j] && !visit[i][j]) {
					checkGroup(i,j);
					result++;
				}
			}
		}
		
		System.out.println(result);
	}

	private static void checkGroup(int r, int c) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.offer(new int[] {r, c});
		
		while(!q.isEmpty()) {
			int[] cur = q.poll();
			visit[cur[0]][cur[1]] = true;
			
			for (int i = 0; i < 4; i++) {
				int nr = cur[0] + dx[i];
				int nc = cur[1] + dy[i];
				
				if(nr < 0 || nc < 0 || nr >= row || nc >= col 
						|| !map[nr][nc] || visit[nr][nc]) continue;
				
				q.offer(new int[] {nr,nc});
			}
		}
	}
}
