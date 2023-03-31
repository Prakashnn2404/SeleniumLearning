package InterfaceTutorial;

public class NewClass extends ExampleInterface{

	public static void main(String[] args) {
		
		NewClass s1 = new NewClass();
		s1.goldLoan();
		s1.PersonalLoan();
	}

	
	public void PersonalLoan() {
		
		System.out.println("This is Personal Loan");
	}

}
