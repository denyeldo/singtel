import java.util.Arrays;



/**
 * Behaviours identified by interfaces below
 * @author eldodenypoliakudiyilmathew
 *
 */
interface Flying {
	default void fly() {
		System.out.println("I am flying");
	}
}

interface Walking {
	default void walk() {
		System.out.println("I am walking");
	}
}

interface LivingArrangments {

	default void arrangementSound(Animal animal) {
		((Singing) animal).sing();
	}

}

interface Swim {
	default void swim() {
		System.out.println("I can swim");
	}
}

interface Singing {
	default void sing() {
		System.out.println("I can sing");
	}
}

/**
 * Abstract classes which do not need intialization
 */
abstract class FlightlessBird extends Animal {

}




abstract class FlyingBird extends Bird {

	
}

abstract class SwimmingAnimal extends Animal implements Swim {
	
	String size;
	String color;
	boolean isEatOtherFish = false;
	String behaviour = null;
	
	void walk() {
		System.out.println("I dont walking");
	}

	
}



abstract class MammalSwimmer extends SwimmingAnimal {
	
}



/**
 * Concrete implementation of classes
 * @author eldodenypoliakudiyilmathew
 *
 */

class Animal {

	String gender;

	

}

class Bird extends Animal implements Singing,Flying {

}



class Duck extends FlightlessBird implements Swim {

	public void sing() {
		System.out.println("Quack ,quack");
	}
}

class Chicken extends FlightlessBird {
	Chicken() {
		this.gender = ("FEMALE");
	}

	public void sing() {
		System.out.println("Cluck, cluck");
	}
}

class Rooster extends Chicken {
	Rooster() {
		this.gender = ("MALE");
	}

	public void sing() {
		System.out.println("Cock-a-doodle-doo");
	}
}



class Dog extends Animal {
	void sing() {
		System.out.println("Woof ,woof");
	}
}

class Cat extends Animal {
	void sing() {
		System.out.println("Me ow");
	}
}

class Parrot extends Bird implements LivingArrangments {

	Animal relatedAnimal;

	public void sing() {
		((Singing) relatedAnimal).sing();
	}

}

class Dolphin extends MammalSwimmer {	
	
}
class Fish extends SwimmingAnimal {
	
	
	
}

class Shark extends Fish{
	
	Shark(){
		this.size = "large";
		this.color = "grey";
		this.isEatOtherFish = true;
		this.behaviour = null;
	}
	
}

class ClownFish extends Fish {
	ClownFish() {
		this.size = "small";
		this.color = "orange";
		this.behaviour = "make jokes";
	}
}
class Caterpillar extends Animal implements Walking {
	
}

class Butterfly extends Caterpillar implements Flying {
	void sing() {
		System.out.println("Does not make any sound");
	}
}



public class Solution {
	public static void main(String[] args) {
		Animal[] animals = {
			new Bird(),
			new Duck(),
			new Chicken(),
			new Rooster(),
			new Parrot(),
			new Fish(),
			new Shark(),
			new ClownFish(),
			new Dolphin(),
			//new Frog(),
			new Dog(),
			new Butterfly(),
			new Cat()
			
		};
		System.out.println(animals.length);
		
		//animals who can fly
		System.out.println("Number of Animals can fly: "+Arrays.stream(animals).filter(x-> x instanceof Flying).count());
		System.out.println("Number of Animals can walk: "+Arrays.stream(animals).filter(x-> x instanceof Walking).count());
		System.out.println("Number of Animals can sing: "+Arrays.stream(animals).filter(x-> x instanceof Singing).count());
		System.out.println("Number of Animals can swim: "+Arrays.stream(animals).filter(x-> x instanceof Swim).count());
	}
}
