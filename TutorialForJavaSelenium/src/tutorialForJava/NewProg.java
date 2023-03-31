package tutorialForJava;

public class NewProg {

	public static void main(String[] args) {
		String n1 = new String("Java");
		String n2 ="Java", n3="";
		char ch;
		
		for (int i=0;i<n2.length();i++) {
			ch=n2.charAt(i);
			n3=ch+n3;
		}
		System.out.println(n3);
//		int t1 = 3456;
//		int a = Integer.reverse(t1);
//		System.out.println(a);
//		
//		System.out.println(n1);
//		System.out.println(n2);
//		System.out.println(n1.equals(n2));
	}

}
