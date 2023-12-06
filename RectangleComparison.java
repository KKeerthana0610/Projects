package assignment2;

public class RectangleComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Rectangle rectangle1 = new Rectangle(5, 10); // Replace with your random values
	        Rectangle rectangle2 = new Rectangle(7, 8); // Replace with your random values

	        int area1 = rectangle1.calculateArea();
	        int area2 = rectangle2.calculateArea();

	        // Compare the areas of the two rectangles using the Relational Operator
	        if (area1 > area2) {
	            System.out.println("Rectangle1 > Rectangle2");
	        } else if (area1 < area2) {
	            System.out.println("Rectangle1 < Rectangle2");
	        } else {
	            System.out.println("They are equal");
	        }
	    }
	

	}


