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
	
	@Test
	void testDuckSound() {
		Duck duck = new Duck();
		duck.sing();
	}
	
	@Test
	void testChickenSound() {
		Chicken chicken = new Chicken();
		chicken.sing();
	}
	
	@Test
	void testRooster() {
		Rooster rooster = new Rooster();
		rooster.sing();
		assertTrue(rooster instanceof Chicken);
		assertTrue(rooster.gender == "MALE");
	}
	
	@Test
	void testParrotProximity() {
		Parrot parrot = new Parrot();
		parrot.relatedAnimal = new Dog();
		//Sings sound of related or proximity animal
		parrot.sing();
	}

}
