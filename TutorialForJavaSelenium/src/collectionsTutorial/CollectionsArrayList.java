package collectionsTutorial;

import java.util.ArrayList;

public class CollectionsArrayList {

	public static void main(String[] args) {
		
		ArrayList L1 = new ArrayList();
		L1.add("login");
		L1.add(12);
		System.out.println(L1);
		L1.addAll(L1);
		//System.out.println(L1);
		//L1.clear();
		System.out.println(L1);
		L1.contains(12);
		System.out.println(L1);
	}

}
