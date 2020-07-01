package pet.cat;
import pet.Pet;

public class Cat extends Pet{
	public int foodBowl;
	
   public Cat(String name, String color, int numLegs, int foodBite){
		super(name, color,numLegs, foodBite);
	}
	public  void call(int a) {
		System.out.println("The cat is saying a meow"+ a);
	}
	


@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + foodBowl;
		return result;
	}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!(obj instanceof Cat))
		return false;
	Cat other = (Cat) obj;
	if (foodBowl != other.foodBowl)
		return false;
	return true;
}


}