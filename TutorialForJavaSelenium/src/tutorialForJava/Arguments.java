package tutorialForJava;

public class Arguments {
	
	int x;
	int y;

//	public Arguments(int i, int j) {
//		x=i;
//		y=j;
//	}

	public static void main(String[] args) {
		Arguments obj = new Arguments();
		obj.calc(40,20);
	}
	
	public void calc(int a, int b) {
		int c = x+y;
		System.out.println(c);
	}

}
