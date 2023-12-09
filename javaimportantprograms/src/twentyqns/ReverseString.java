package twentyqns;
import java.lang.*;
import java.io.*;
import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "keerthana";
		 
        // convert String to character array
        // by using toCharArray
        char[] try1 = input.toCharArray();
 
        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);

	}

}
