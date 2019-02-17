package degreesofseparation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testDegrees {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1() {
		assertEquals(4,DegreesOfSeparation.getGCF(12, 16));
		assertEquals(6,DegreesOfSeparation.getGCF(12, 18));
		
	}
	
	@Test
	void test2() {
		assertEquals(4,DegreesOfSeparation.getGCF(12, 16));
		assertEquals(6,DegreesOfSeparation.getGCF(12, 18));
		
	}

}
