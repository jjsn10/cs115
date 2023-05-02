package week02;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void testGetName() {
		String name = "John";
		Person p = new Person("John","1991-02-12","M","385-545-2356");
		assertEquals(name, p.getName());
	}

	@Test
	void testSetName() {
		String name="Pedro";
		Person p = new Person();
		p.setName("Pedro");
		assertEquals(p.getName(),name);
	}

	@Test
	void testGetDob() {
		Person p = new Person("John","1991-02-12","M","385-545-2356");
		LocalDate dob = p.getDob();
		assertEquals(p.getDob(),dob);
	}

	@Test
	void testSetDob() {
		Person p = new Person("John","1991-02-12","M","385-545-2356");
		p.setDob("1992-03-11");
		assertEquals(LocalDate.parse("1992-03-11"), p.getDob());
	}

	@Test
	void testGetGender() {
		Person p = new Person("John","1991-02-12","M","385-545-2356");
		assertEquals("M",p.getGender());
	}

	@Test
	void testSetGender() {
		Person p = new Person("John","1991-02-12","M","385-545-2356");
		p.setGender("F");
		assertEquals("F",p.getGender());
	}

	@Test
	void testGetPhone() {
		Person p = new Person("John","1991-02-12","M","385-545-2356");
		assertEquals("385-545-2356",p.getPhone());
	}

	@Test
	void testSetPhone() {
		Person p = new Person("John","1991-02-12","M","385-545-2356");
		p.setPhone("801-254-4553");
		assertEquals("801-254-4553",p.getPhone());
	}

}
