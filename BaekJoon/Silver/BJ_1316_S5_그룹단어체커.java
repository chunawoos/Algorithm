import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1316_S5_그룹단어체커 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int res = 0;
		
		for (int i = 0; i < N; i++) {
			String word = bf.readLine();
			char cur = word.charAt(0);
			boolean [] pastWord = new boolean[26];
			pastWord[cur-'a'] = true;
			boolean isGroup = true;
			for (int j = 1; j < word.length(); j++) {
				if(word.charAt(j) != cur) {
					if(pastWord[word.charAt(j)-'a']) {
						isGroup = false;
						break;
					} else {
						cur = word.charAt(j);
						pastWord[word.charAt(j)-'a'] = true;
					}
				}
			}
			if(isGroup) {
				res++;
			}
		}
		System.out.println(res);
	}
}
