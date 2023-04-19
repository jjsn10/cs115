import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Lab1i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> numbers = new ArrayList<Integer>();
		boolean status = false;
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
