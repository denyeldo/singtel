import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClass {

	@Test
	void testFish() {
		//fail("Not yet implemented");
		Fish fish = new Fish();
		assertTrue(fish instanceof Swim);
	}
	
	@Test
	void testBird() {
		Parrot parrot = new Parrot();
		assertTrue(parrot instanceof Bird);
	}

}
