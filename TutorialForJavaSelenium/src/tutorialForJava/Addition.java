package tutorialForJava;

public class Addition {

	public static void main(String[] args)
    {
        // print the sum
        double arr[] = { 10,90.78,111,8989,7876 };
        System.out.println("The sum of elements of given array is: "+ sumOfArray(arr));
        System.out.println("The Average of elements of given array is: "+ avgOfArray(arr));
    }

	public static double sumOfArray(double arr[])
    {
        // initialize sum to 0
        double sum = 0;
        
        // iterate through the array using loop
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
  
        // return sum as the answer
        return sum;
    }
	
	public static double avgOfArray(double arr[])
    {
        // Initialize sum to 0
        double avg = 0;
        double avg1 = 0;
        
        // iterate through the array using loop
        for (int i = 0; i < arr.length; i++) {
            avg = avg + arr[i];
            avg1=avg/arr.length;
            
        }
  
        // return sum as the answer
        return avg1;
    }
}
