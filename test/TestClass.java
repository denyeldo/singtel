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
		ClownFish clown = new ClownFish();
		
		assertTrue(clown instanceof Fish);
		assertTrue(clown.size == "small" && clown.color=="orange");
		assertTrue(clown.behaviour == "make jokes");
	}
	
	@Test
	void testDolphin() {
		
		Dolphin dolphin = new Dolphin();
		assertTrue(dolphin instanceof MammalSwimmer);
		System.out.println("Dolphin not fish");
		
	}
	
	
	@Test
	void testButterfly() {
		Butterfly butterfly = new Butterfly();
		assertTrue(butterfly instanceof Flying);
	}
	
	@Test
	void testCattepillar() {
		Caterpillar cp = new Caterpillar();
		assertTrue(cp instanceof Walking);
	}
	

}
