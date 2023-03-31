package InterfaceTutorial;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ClassC extends ClassB{

	public static void main(String[] args) {
		
		method1();
		method2();
		
//		List<Integer> L1=Arrays.asList(1,11,111,12,12,13,34,55);
//		System.out.println("The Series Starts with 1 is displayed below");
//		L1.stream().map(a->a+" ").filter(a->a.startsWith("1")).forEach(System.out::println);
//		System.out.println("The Even Numbers from the given list is");
//		L1.stream().filter(a->a%2==0).forEach(System.out::println);
//		Set<Integer> S1=L1.stream().filter(n->Collections.frequency(L1,n)>1).collect(Collectors.toSet());
//		System.out.println(S1);
//		
////		Set<Integer> S1=new LinkedHashSet<>(L1);
////		System.out.println(S1);
//		
	}
}
