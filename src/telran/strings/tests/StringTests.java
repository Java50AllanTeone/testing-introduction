package telran.strings.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTests {

	@Test
	void testEqualsIgnoreCase() {
		fail("Not yet implemented");
	}

	@Test
	void testCompareTo() {
		String str = "abcd";
		
		assertEquals(32, str.compareTo("Abcd"));
		assertEquals(32, str.compareTo("aBcd"));
		assertEquals(32, str.compareTo("abCd"));
		assertEquals(32, str.compareTo("abcD"));
		
		assertTrue(str.compareTo("Abcdefg") > 0);
		assertTrue(str.compareTo("A") > 0);
		
		assertFalse(str.compareTo("acde") > 0);
		assertFalse(str.compareTo("abcde") > 0);
	}

	@Test
	void testCompareToIgnoreCase() {
		fail("Not yet implemented");
	}

	@Test
	void testStartsWithString() {
		fail("Not yet implemented");
	}

	@Test
	void testEndsWith() {
		fail("Not yet implemented");
	}

	@Test
	void testIndexOfString() {
		fail("Not yet implemented");
	}

	@Test
	void testConcat() {
		fail("Not yet implemented");
	}

}
