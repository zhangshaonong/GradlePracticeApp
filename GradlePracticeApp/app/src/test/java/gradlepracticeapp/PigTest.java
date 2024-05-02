package gradlepracticeapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
class PigTest {


	private static Pig pigService;
	
    @BeforeAll
    public static void init() {
    	pigService = new Pig();
    }
    
	@Test
	void testadd() {
		assertEquals(5, pigService.add(2, 3), "2 + 3 should equal 5");
		
	}

	@Test
	void testminu() {
		assertEquals(1, pigService.minaus(4, 3), "4 - 3 should equal 1");

	}

}
