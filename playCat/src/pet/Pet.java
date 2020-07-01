package pet;

public class Pet {

	String name;
	String color;
	int numLegs;
	int foodBite;
	
	public Pet(){
		
	}
	
    public Pet(String name, String color, int numLegs, int foodBite){
    	this.name=name;
    	this.color=color;
    	this.numLegs=numLegs;
    	this.foodBite=foodBite;
	}
	
	public final  void call() {
		System.out.println("The pet is making a call");
	}
	
	public void eat(int foodAmout) {
		while (foodAmout>0) {
			foodAmout-=foodBite;
			call();
		}
	}
}

