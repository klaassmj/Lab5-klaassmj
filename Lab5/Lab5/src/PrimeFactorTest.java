import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;



public class PrimeFactorTest {

	@Test
	public void testJUnit(){
		assertTrue(true);
	}
	
	@Test
	public void testPrimeOne(){
		assertNull(PrimeFactor.prime(1));
	}
	
	@Test
	public void testPrimeTwo(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		assertEquals(PrimeFactor.prime(2), list);
	}
	
	@Test
	public void testPrimeThree(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		assertEquals(PrimeFactor.prime(3), list);
	}
	
	@Test
	public void testPrimeFour(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(2);
		assertEquals(PrimeFactor.prime(4), list);
	}
	
	@Test
	public void testPrimeSix(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		assertEquals(PrimeFactor.prime(6), list);
	}
	
	@Test
	public void testPrimeEight(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(2);
		list.add(2);
		assertEquals(PrimeFactor.prime(8), list);
	}
	
	@Test
	public void testPrimeNine(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(3);
		assertEquals(PrimeFactor.prime(9), list);
	}
	
	@Test
	public void testPrimeBig(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(7);
		list.add(7);
		list.add(1327);
		assertEquals(PrimeFactor.prime(325115), list);
	}
}
