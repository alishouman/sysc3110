package lab6;

import static org.junit.Assert.*;
import junit.framework.TestSuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AllTests extends TestSuite {
	 
	 public static void main(String[] args) {
	 junit.textui.TestRunner.run(suite());
	 }
	 public static TestSuite suite() {
	 TestSuite suite = new TestSuite("Test for com.saorsa.nowplaying.tests");
	 suite.addTest(new TestSuite(TestMovieListWithEmptyList.class));
	 suite.addTest(new TestSuite(TestMovieListWithOneMovie.class));
	 suite.addTest(new TestSuite(TestMovieListWithTwoMovies.class));
	 return suite;
	 }
	
	

}
