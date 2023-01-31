package chap01;

import java.util.ArrayList;

public class Ex04 {

	public static int getSurvivingIndex(int n, int k) {
		ArrayList<Integer> soldiers = new ArrayList<>();
		
		for(int i =1; i<=n; i++) {
			soldiers.add(i);
		}
		ArrayList<Integer> died_soldiers = new ArrayList<>();
		
		while(n>=2) {
			for(int i =1; i<=k-1; i++) {
				soldiers.add(soldiers.get(0));
				soldiers.remove(0);
			}
			died_soldiers.add(soldiers.get(0));
			soldiers.remove(0);
			n--;
		}
		for(Integer died : died_soldiers) {
			System.out.println(died + "번 군사가 죽습니다.");
		}
		
		return soldiers.get(0);
	}
}
