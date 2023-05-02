package week02;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;
import week02.Person;

public class MagelightUniversity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> persons = new ArrayList<Person>();
		Person p1 = new Person("Rachel","1993-05-12","F","801-555-1212");
		Person p2 = new Person("Jose","2004-12-01","M","480-555-1212");
		Person p3 = new Person("Prya","2001-02-27","F","385-555-1212");
		Person p4 = new Person("Bob","1984-06-06","M","916-555-1212");
		
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		
		LocalDate today = LocalDate.now();
		//System.out.println(today.getYear());
		System.out.printf("---------------------------------------------------------%n");
		System.out.printf("| %-10s | %-10s | %-10s | %-14s | %n", "Name", "Age", "Gender", "Phone");
		System.out.printf("---------------------------------------------------------%n");
		
		for(Person person:persons) {
			Period p = Period.between(person.getDob(),today);
			System.out.printf("| %-10s | %-10s | %-10s | %-14s | %n",person.getName(),p.getYears(),person.getGender(),person.getPhone());
			//System.out.println(p.getYears());
			
		}
	}

}
