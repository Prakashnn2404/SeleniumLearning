package tutorialForJava;
public class Series  
{
 public static void main(String args[])throws Exception{
 {
//  Scanner sc = new Scanner(System.in);
//  System.out.print("Enter the number of terms: ");
	 String string = "10";

//	// if(NumberUtils.isParsable(string)) { 
//	     System.out.println("String is numeric!");
//	     // Do something
//	 } else {
//	     System.out.println("String is not numeric.");
//	 }
	 
	 
  int n = 5;
  int s=0;                                          // s for terms of series, c for n terms
  for (int i=0; i<=n; i++)                          // To generate n terms
  {
   s = s * 10 + 1;
   System.out.println(s);
  }                                                           //for  ends
 }
 }
}