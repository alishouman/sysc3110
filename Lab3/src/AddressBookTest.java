import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;


public class AddressBookTest {
AddressBook book;
	@Before
	public void setUp() throws Exception {
		book=new AddressBook();
	}

	@After
	public void tearDown() throws Exception {
	}


	

	@Test
	public void testAddBuddy() {
		int size=book.size();
		book.addBuddy(new BuddyInfo("Adam","24 street","613444555",20));
		assertEquals(size+1,book.size());
	}

	@Test
	public void testRemoveBuddy() {
		
		book.addBuddy(new BuddyInfo("Adam","24 street","613444555",20));
		book.addBuddy(new BuddyInfo("Adam","24 street","613444555",21));
		int size=book.size();
		book.removeBuddy(0);
		assertEquals(size-1,book.size());
	}

	public void testSize(){
		book.addBuddy(new BuddyInfo("Adam","24 street","613444555",20));
		assertEquals(1,book.size());
		
	}
	public void testClear(){
		book.addBuddy(new BuddyInfo("Adam","24 street","613444555",20));
		book.clear();
		assertEquals(0,book.size());
	}

}
