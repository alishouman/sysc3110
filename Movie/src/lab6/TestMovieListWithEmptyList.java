package lab6;

import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMovieListWithEmptyList extends TestCase {
	 private MovieList movieList = null;
	 protected void setUp() {
	 movieList = new MovieList();
	 }
	 @Test
	 public void testSize() { assertEquals("Size of empty movie list should be 0.", 0, movieList.size());
	 }
	 public static void main(String[] args) {
		 junit.textui.TestRunner.run(suite());
		 }
		 public static junit.framework.Test suite(){
				return new JUnit4TestAdapter(TestMovieListWithEmptyList.class);
			}
	}