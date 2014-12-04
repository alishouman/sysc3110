package main;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;

public class BuddyInfoTest {
	BuddyInfo buddy;

	@Before
	public void setUp() throws Exception {
		buddy=new BuddyInfo("Adam","24 street","613444555",20);

	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testBuddyInfo() {
		assertEquals(buddy.getName(),"Adam");
		assertEquals(buddy.getAddress(),"24 street");
		assertEquals(buddy.getTelephone(),"613444555");
		assertEquals(buddy.getAge(),20);
		BuddyInfo buddy1=new BuddyInfo("lory","21 street","61311111",16);
		buddy=new BuddyInfo(buddy1);
		assertEquals(buddy.getName(),"lory");
		assertEquals(buddy.getAddress(),"21 street");
		assertEquals(buddy.getTelephone(),"61311111");
		assertEquals(buddy.getAge(),16);
		
		
		
	}

	@Test
	public void testEqualsBuddyInfo() {
		BuddyInfo buddy1=new BuddyInfo("Adam","24 street","613444555",20);
		assertTrue(buddy.equals(buddy1));
	}
	@Test
	public void testGreeting() {
		
		assertEquals(buddy.greeting(),"Adam Says Hi my friend");
	}
	@Test
	public void testIsOver18() {
		
		assertTrue(buddy.isOver18());
	}

	@Test
	public void testToString() {
		String desc="Name is Adam, address is 24 street, and telephone is 613444555";
		

		assertTrue(buddy.toString().equals(desc));
		
	}

	@Test
	public void testGetName() {
		assertEquals(buddy.getName(),"Adam");
	}

	@Test
	public void testSetName() {
		buddy.setName("Mark");
		assertEquals(buddy.getName(),"Mark");
	}

	@Test
	public void testGetAddress() {
		assertEquals(buddy.getAddress(),"24 street");
	}

	@Test
	public void testSetAddress() {
		buddy.setAddress("23 app");
		assertEquals(buddy.getAddress(),"23 app");
	}

	@Test
	public void testGetTelephone() {
		
		assertEquals(buddy.getTelephone(),"613444555");
	}

	@Test
	public void testSetTelephone() {
		buddy.setTelephone("111");
		assertEquals(buddy.getTelephone(),"111");
		
	}
	public void testSetAge() {
		buddy.setAge(18);
		assertEquals(buddy.getAge(),18);
		
	}
	public void testGetAge() {
	
		assertEquals(buddy.getAge(),20);
		
	}
	public void testIsOverAge() {
		
		assertTrue(buddy.isOver18());
		buddy.setAge(17);
		assertFalse(buddy.isOver18());
		
	}
	public static void main(String[] args) { 	junit.textui.TestRunner.run(suite());}
	public static junit.framework.Test suite(){
		return new JUnit4TestAdapter(BuddyInfoTest.class);
	}


}
