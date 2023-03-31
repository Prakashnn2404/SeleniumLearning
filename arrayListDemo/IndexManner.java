package arrayListDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IndexManner {

	public static void main(String[] args) {
		HashSet<String> St=new HashSet<>();
		St.add("S1");
		St.add("S2");
		St.add("S3");
		St.add("S4");
		
		List<String> L1=new ArrayList<>(St);
		System.out.println(L1.get(3));
	}

}
