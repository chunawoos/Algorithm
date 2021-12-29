package com.ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sw_13229_D3_일요일 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(bf.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
			String day = bf.readLine();
			int dayNum = 0;
			switch(day) {
			case "SUN":
				dayNum = 0;
				break;
			case "MON":
				dayNum = 1;
				break;
			case "TUE":
				dayNum = 2;
				break;
			case "WED":
				dayNum = 3;
				break;
			case "THU":
				dayNum = 4;
				break;
			case "FRI":
				dayNum = 5;
				break;
			case "SAT":
				dayNum = 6;
				break;
			}
			sb.append("#").append(tc).append(" ").append(7-dayNum).append("\n");
		}
		System.out.println(sb.toString());
	}
}
