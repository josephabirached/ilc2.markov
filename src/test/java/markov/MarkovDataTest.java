package markov;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MarkovDataTest {
	
	@Test
	/*
	 *  GIVEN_WHEN_THEN 
	 */
	public void read_text_List() {
		
		List<String> expected = new ArrayList<String>();
		expected.add("Hello");
		expected.add("this");
		expected.add("is");
		expected.add("a");
		expected.add("test!");
		
		String text = "Hello this is a test!";
		
		MarkovData d = new MarkovData();
		d.read(text);
		
		for(int i =0; i< expected.size(); i++) {
			String actual = d.getKeyWord(i);
			
			assertEquals(expected.get(i), actual);
		}
		
	}

}
