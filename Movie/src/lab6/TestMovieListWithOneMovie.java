package lab6;

import static org.junit.Assert.*;

import junit.framework.JUnit4TestAdapter;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMovieListWithOneMovie extends TestCase {
	 private MovieList movieList = null;
	 private Movie starWars = null;
	 @Before
	 protected void setUp() {
	 starWars = new Movie("Star Wars");
	 movieList = new MovieList();
	 movieList.add(starWars);
	 }
	 @Test
	 public void testSize() {
	 assertEquals("Size of one item list should be 1.", 1, movieList.size());
	 }
	 public static void main(String[] args) {
	 junit.textui.TestRunner.run(suite());
	 }
	 public static junit.framework.Test suite(){
			return new JUnit4TestAdapter(TestMovieListWithOneMovie.class);
		}
	 
	}

