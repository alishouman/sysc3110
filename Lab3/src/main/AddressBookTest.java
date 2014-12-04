package main;
import static org.junit.Assert.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

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
	@Test
	public void testSize(){
		book.addBuddy(new BuddyInfo("Adam","24 street","613444555",20));
		assertEquals(1,book.size());
		
	}

/*	@Test
	public void testExport(){
		BuddyInfo buddy=new BuddyInfo("Tom", "Carleton","1234",20);
		
		book.addBuddy(buddy);
		book.export("addressBook.txt");
		File file = new File("addressBook.txt");
		assertTrue(file.exists());
	}
	
	@Test
	public void testImport() {
		BuddyInfo buddy=new BuddyInfo("Tom", "Carleton","1234",20);
		
		book.addBuddy(buddy);
		AddressBook book2=book.import1("addressBook.txt");
		//System.out.println(book2+" "+book);
		assertEquals(book.toString(),book2.toString());
		
	}*/
	@Test
	public void testExport1(){
		BuddyInfo buddy=new BuddyInfo("Tom", "Carleton","1234",20);
		
		book.addBuddy(buddy);
		book.export1("addressBook.txt");
		File file = new File("addressBook.txt");
		assertTrue(file.exists());
	}
	
	@Test
	public void testImport1() {
		BuddyInfo buddy=new BuddyInfo("Tom", "Carleton","1234",20);
		
		book.addBuddy(buddy);
		AddressBook book2=book.import2("addressBook.txt");
	System.out.println(book2+" "+book);
		assertEquals(book.toString(),book2.toString());
		
	}
}
