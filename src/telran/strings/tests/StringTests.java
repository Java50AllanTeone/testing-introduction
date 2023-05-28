package telran.strings.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTests {

	@Test
	void testEqualsIgnoreCase() {
		String str = "abcd";
		
		assertTrue(str.equalsIgnoreCase(str));
		assertTrue(str.equalsIgnoreCase("ABCD"));
		
		assertFalse(str.equalsIgnoreCase("abc"));
		assertFalse(str.equalsIgnoreCase("abcde"));
		assertFalse(str.equalsIgnoreCase("bcd"));
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
		String str = "abcd";
		
		assertEquals(0, str.compareToIgnoreCase("Abcd"));
		assertEquals(0, str.compareToIgnoreCase("aBcd"));
		assertEquals(0, str.compareToIgnoreCase("abCd"));
		assertEquals(0, str.compareToIgnoreCase("abcD"));
		
		assertTrue(str.compareToIgnoreCase("Abcdefg") < 0);
	}

	@Test
	void testStartsWith() {
		String str = "abcd";
		
		assertTrue(str.startsWith(str));
		assertTrue(str.startsWith("abc"));
		assertTrue(str.startsWith("ab"));
		assertTrue(str.startsWith("ab"));
		
		assertFalse(str.startsWith("bcd"));
		assertFalse(str.startsWith("cd"));
		assertFalse(str.startsWith("d"));
		
		assertFalse(str.startsWith("Abcd"));
		
	}

	@Test
	void testEndsWith() {
		String str = "abcd";
		
		assertTrue(str.endsWith(str));
		assertTrue(str.endsWith("bcd"));
		assertTrue(str.endsWith("cd"));
		assertTrue(str.endsWith("d"));
		
		assertFalse(str.endsWith("abc"));
		assertFalse(str.endsWith("ab"));
		assertFalse(str.endsWith("a"));
		
		assertFalse(str.endsWith("abcD"));
		
	}

	@Test
	void testIndexOf() {
		String str = "Hello planet earth, you are a great planet.";
		
		assertEquals(0, str.indexOf(str));
		
		assertEquals(0, str.indexOf("Hello"));
		assertEquals(5, str.indexOf(" "));
		assertEquals(str.length() - 1, str.indexOf("."));
		
		assertEquals(-1, str.indexOf("hello"));
		assertEquals(-1, str.indexOf("1"));
		assertEquals(-1, str.indexOf("  "));
	}
	
	@Test
	void testLastIndexOf() {
		String str = "Hello planet earth. You are a great planet.";
				
		assertEquals(0, str.lastIndexOf(str));
		
		assertEquals(str.length() - 1, str.lastIndexOf("."));
		assertEquals(str.length() - 8, str.lastIndexOf(" "));
		
		assertEquals(-1, str.lastIndexOf("hello"));
		assertEquals(-1, str.lastIndexOf("1"));
		assertEquals(-1, str.lastIndexOf("  "));
		
		
	}

	@Test
	void testConcat() {
		String str = "abcd";
		
		assertTrue(str.concat(str).equals(str + str));
		
		assertTrue(str.concat("1").equals(str + "1"));
		assertTrue("1".concat(str).equals("1" + str));
	}

}
