package arrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;

public class DemoArrayList {

	public static void main(String[] args) {
		Employee emp1 = new Employee(11, "AAAA", "AAAA@gmail.com");
		Employee emp2 = new Employee(11, "BBBB", "BBBB@gmail.com");
		Employee emp3 = new Employee(11, "CCCC", "CCCC@gmail.com");
		Employee emp4 = new Employee(11, "DDDD", "DDDD@gmail.com");
		
		ArrayList<Employee> empList= new ArrayList<>();
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		
		//System.out.println(emp1.EmpID+emp2.EmpmailID);
		
		//System.out.println(empList.get(0).EmpName);
		
		List<String> L1 = new ArrayList<String>();
		L1.add("FirstName");
		L1.add("MiddleName");
		L1.add("LastName");
		
		List<String> L2=Arrays.asList("EFirstName","EMiddleName","ELastname");
		
		//L2.addAll(L1);
		//System.out.println(L2);
		
		for(int i=0;i<L2.size();i++) {
			L1.add(L2.get(i));
			
		}
		System.out.println(L1);
//		Iterator<String> itr=L1.iterator();
//		while(itr.hasNext()) {
//			String concate=itr.next();
//			String NewValue=concate;
//			String ch=NewValue+concate;
//			System.out.println(ch);
//		}
		
		
	}

}
