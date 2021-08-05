package activities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Activity1 {

	static List<String> list;
	
	@BeforeEach
	public void setUp() {
		list=new ArrayList();
		list.add("alpha");
		list.add("beta");
	}
	
	@Test
	public void insertTest() {
		assertEquals(2, list.size(),"checking size");
		list.add("gama");
		assertEquals(3, list.size(),"checking new size");
		
		assertEquals("alpha", list.get(0),"verifying alpha");
		assertEquals("beta", list.get(1),"verifying beta");
		assertEquals("gama", list.get(2),"verifying gama");
	}
	
	@Test
	public void replaceTest() {
		
		assertEquals(2, list.size(),"checking size");
		
		list.set(1, "alpha plus");	
		assertEquals("alpha", list.get(0),"verifying alpha");
		assertEquals("alpha plus", list.get(1),"verifying alpha plus");
		
		assertEquals(2, list.size(),"checking size after replacing");
	}			

}
