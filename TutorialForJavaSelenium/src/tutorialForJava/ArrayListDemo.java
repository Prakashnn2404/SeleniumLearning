package tutorialForJava;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		Constructor s1 = new Constructor(11, "Naren", "Naren@gmail.com");
		Constructor s2 = new Constructor(12, "Naren", "Naren@gmail.com");
		Constructor s3 = new Constructor(13, "Naren", "Naren@gmail.com");
		
		ArrayList<Constructor> obj1=new ArrayList<>();
		
		obj1.add(s1);
		obj1.add(s2);
		obj1.add(s3);
		
		System.out.println(obj1);
	}
}
