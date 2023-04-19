import java.util.Scanner;
import java.util.ArrayList;

/**
* File: Lab1i.java
* Description: Java Basics Review
* Instructor's Name: Jeff Light
*
* @author Jared Sanchez
* @since 04/19/2023
*/

public class Lab1i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList numbers to store numbers provide by the user
		ArrayList <Integer> numbers = new ArrayList<Integer>();
		//boolean status: variable to handle if we are in or out of the do while
		boolean status = false;
		//Scanner input: variable to get the input from the console.
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("In this program, you will enter a list of numbers.");
		
		do {
			System.out.println("Please enter a number (or hit the <Enter> key to stop):");
			try {
				String num="";
				num = input.nextLine();
				if(num.equals("")) {
					status = true;
				}else {
					numbers.add(Integer.parseInt(num));
				}
			} catch (Exception e) {
				System.out.println("Invalid response. " + e.getMessage()+ " is not a number");
			}
		}while(!status);
		
		System.out.println("The total of the list of numbers is:"+addNumbers(numbers));
		System.out.println("The biggest number in the list is:"+largestNumber(numbers));
		
	}
	/**
	* Method Name: addNumbers(ArrayList<Integer> numbers)
	* Description: This function sum all numbers added to the ArrayList numbers
	* Returns: Returns the sum of the integer numbers added to the ArrayList numbers
	*
	* @param ArrayList<Integer> numbers ArrayList of Integer numbers filled at the main method
	*/
	public static int addNumbers(ArrayList<Integer> numbers) {
		int sum = 0;
		for(int i=0; i<numbers.size(); i++) {
			sum += numbers.get(i);
		}
		return sum;
	}
	public static int largestNumber(ArrayList<Integer> numbers) {
		int largest = numbers.get(0);
		for( int i=0; i<numbers.size();i++) {
			if(numbers.get(i)>largest) {
				largest = numbers.get(i);
			}
		}
		return largest;
	}

}
