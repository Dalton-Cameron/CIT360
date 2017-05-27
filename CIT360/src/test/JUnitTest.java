package test;

import org.junit.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

	public class JUnitTest {

	    Person person = new Person("Cameron");
	    
	    //testing the persons name
	    @Test
	    public void testEquals() throws Exception {
	        assertEquals("Cameron", person.getName());

	    }
	    //testing name but expected to fail so ignoring the test in results
	    @Test
	    @Ignore
	    public void testEquals2() throws Exception{
	    	assertEquals("Bryce", person.getName());
	    }
	    
	    //testing the null person
	    @Test
	    public void testNotEquals() throws Exception {
	        assertNotEquals(null, person.getName());

	    }

	    ///test person methods is alive
	    @Test
	    public void testTrue() throws Exception {
	        assertFalse(person.isAlive());

	    }

	    //test another method
	    @Test
	    public void testFalse() throws Exception {
	        assertTrue(person.isAliveNow());

	    }

	    //test null for methods
	    @Test
	    public void testNull() throws Exception {
	        assertNotNull(person.isAliveNow());

	    }

	    //test not null
	    @Test
	    public void testNotNull() throws Exception {
	        assertNotNull(person.isAlive());

	    }

	    //test false for method
	    @Test
	    public void testAssertSame() throws Exception {
	        assertSame(false, person.isAlive());

	    }

	    //test is not null for name
	    @Test
	    public void testAssertThat() throws Exception {
	        assertThat(person.getName(), is(notNullValue()));

	    }

	    //testing exception
	    @Test
	    public void testException() {
	        try {
	            person.throwException();
	            assert false;
	        } catch (RuntimeException e) {
	            assert true;
	        }
	    }

	    }