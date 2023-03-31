package tutorialForJava;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		String mystr="Abbbajhg";
		System.out.println(mystr.length());
		for(int i=mystr.length();i>0;i--) {
			System.out.print(mystr.charAt(i-1));
		}
		
		StringBuffer buff=new StringBuffer(mystr);
		buff.reverse();
		System.out.println(buff);
		String newData=buff.toString();
		if(mystr.equals(newData)) {
			System.out.println("Yes");
		}else {
		System.out.println("No");
		}
		
		
		
		
		
		
		
		
		
		
		
//		int a=10,b=20;
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println("Reverse Number "+a+" "+b);		
		for(int i=0;i<=1000;i++)
		{
			boolean istrue = true;
			if (i>1) {
				for (int j=2;j<i;j++) {
					if(i%j==0) {
						istrue=false;
					}
				}
			}else {
				istrue=false;
			}
			if(istrue) {
				System.out.print(i+ " ");
			}
		}		    

	}

}
