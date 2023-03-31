package tutorialForJava;

import java.util.ArrayList;

public class Trainer {
	
	public static void main(String[] args) {
		
		int n=5;
		ArrayList<Integer> a = new ArrayList<Integer>(n);
		
		for (int i=1; i<=n; i++) {
			a.add(i);
			System.out.println("the number is "+a.size());
		}
		
	}
}
