package arrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public int sum(int a,int b) {
		int sum=a+b;
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		int[] a= {12,14,13,13,23,44,14,29,29};
		
		for (int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
			
		}
		
		
//		int input=120;
//		int fact=1;
//		for (int i=1;i<=input;i++) {
//			fact=fact*i;
//		}
//		
//		System.out.println(fact);
//		
//		
//		
//		RemoveDuplicates rm=new RemoveDuplicates();
//		int sum = rm.sum(10, 20);
//		System.out.println(sum);		
//		
//		//////////////////////////////
//		
//		String a="abc", b="xyz", c="123";		
////		char[] ch1=new char[a.length()];
////		char[] ch2=new char[a.length()];
////		char[] ch3=new char[a.length()];
//		char[] ch1=a.toCharArray();
//		char[] ch2=b.toCharArray();
//		char[] ch3=c.toCharArray();
//		
//		
//		for(int i=0;i<3;i++) {
////			ch1[i]=a.charAt(i);
////			ch2[i]=b.charAt(i);
////			ch3[i]=c.charAt(i);
//			System.out.print(ch1[i]+""+ch3[i]+""+ch2[i]);
//		}
//			
//		
//		
//		
//		
////		List<String> animals=Arrays.asList("AAA","AAA","BBB","CCC","CCC");
//////		ArrayList<Integer> a1=new ArrayList<>();
//////		a1.add(11);
//////		a1.add(13);
//////		
////		
////		
//		Set<String> S1=new LinkedHashSet<>(animals);
//		
//		S1.remove("AAA");
//		System.out.println(S1);
//		
		
//		System.out.println(animals);
//		
//		for(int i=0;i<animals.size();i++) {
//			for(int j=1+i;i<animals.size();j++) {
//				if(animals.get(i).equals(animals.get(j))) {
//					animals.remove(j);
//					j--;
//				}
//			}
//		}
//		System.out.println(animals);
//		
//		
		
	
	}

}
