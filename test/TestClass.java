import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClass {

	@Test
	void testFish() {
		//fail("Not yet implemented");
		Fish fish = new Fish();
		assertTrue(fish instanceof Swim);
		assertFalse(fish instanceof Singing);
		assertFalse(fish instanceof Walking);
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
	void testParrotProximitywithDogNearBy() {
		Parrot parrot = new Parrot();
		parrot.relatedAnimal = new Dog();
		//Sings sound of related or proximity animal
		System.out.println("Dog sound by parrot below");
		parrot.sing();
	}
	
	@Test
	void testShark() {
		
		Shark shark = new Shark();
		
		assertTrue(shark instanceof Fish);
		assertTrue(shark.size == "large" && shark.color=="grey");
		
	}
	
	@Test
	void testClownFish() {
		ClownFish shark = new ClownFish();
		
		assertTrue(shark instanceof Fish);
		assertTrue(shark.size == "small" && shark.color=="orange");
	}
	
	

}
