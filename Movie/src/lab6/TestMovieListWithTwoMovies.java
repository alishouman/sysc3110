package lab6;

import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMovieListWithTwoMovies extends TestCase {
	 private MovieList movieList = null;
	 private Movie starWars = null;
	 private Movie starTrek = null;
	 private Movie stargate = null;
	 @Before
	 protected void setUp() {
	 starWars = new Movie("Star Wars");
	 starTrek = new Movie("Star Trek");
	 stargate = new Movie("StarGate");
	 movieList = new MovieList();
	 movieList.add(starWars);
	 movieList.add(starTrek);
	 }
	 
	 @Test
	 public void testSizeAfterAddingTwo() {
	 assertEquals("Size of a two item list should be 2.", 2, movieList.size());
	 }
	 @Test
	 public void testContents() {
	 assertTrue("List should contain starWars.", movieList.contains(starWars));
	 assertTrue("List should contain starTrek.", movieList.contains(starTrek));
	 assertFalse("List should not contain stargate.",
	movieList.contains(stargate));
	 }
	 public static void main(String[] args) {
		 junit.textui.TestRunner.run(suite());
		 }
		 public static junit.framework.Test suite(){
				return new JUnit4TestAdapter(TestMovieListWithTwoMovies.class);
			}
	}
