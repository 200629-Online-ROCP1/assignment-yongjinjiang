package driver;

import pet.cat.Cat;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			  Cat c=new Cat("little kitty","black",4,1);
//			  Cat(String name, String color, int numLegs, int foodBite);
			  
		      c.foodBowl=0;
		
		     
		      if (c.foodBowl==0) {
		    	  c.foodBowl=10;
		    	  System.out.println("The amout of food is "+c.foodBowl);
		      }
		      
		      System.out.println(c.toString());
		      
		      c.eat(c.foodBowl);
		      c.call(1333);
		      c.call();
		
	}

}
