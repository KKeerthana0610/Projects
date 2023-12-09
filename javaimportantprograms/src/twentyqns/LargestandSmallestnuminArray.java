package twentyqns;
import java.io.*; 
import java.util.*; 

public class LargestandSmallestnuminArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 111, 13, 25, 9, 34, 1 }; 
        int n = arr.length; 
  
        // sorting the array using 
        // in-built sort function 
        Arrays.sort(arr); 
  
        // printing the desired element 
        System.out.println("smallest element is " + arr[0]); 
        System.out.println("second smallest element is "
                           + arr[1]); 

	}

}
