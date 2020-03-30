package com.billydev.blib._Exp001;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConcatenationTest {

	@Test
    public void testConcat() {
	Concatenation myConcat = new Concatenation();
        String result = myConcat.concat("Hello", "World");
        assertEquals("HelloWorld", result);
    }
}
