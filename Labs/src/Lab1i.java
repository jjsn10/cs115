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
				//System.out.println("17:"+num);
				//System.out.println("18:"+input.nextLine());
				if(num.equals("")) {
					status = true;
				}else {
				  System.out.println(Integer.parseInt(num));
				}
			} catch (Exception e) {
				System.out.println("Please enter a Integer number" + e.getMessage());
			}
		}while(!status);
		numbers.add(4);
		numbers.add(7);
		numbers.add(9);
		//System.out.println(largestNumber(numbers));
		System.out.println("I left the do while");
	}
	public void addNumbers() {
		
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
