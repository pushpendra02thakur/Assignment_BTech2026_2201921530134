// Using inheritance, one class can acquire the properties of others. Consider the following Animal class:

// This class has only one method, walk. Next, we want to create a Bird class that also has a fly method. We do this using extends keyword:
  
// Finally, we can create a Bird object that can both fly and walk.


//hackerrank

class Animal{
	void walk(){
		System.out.println("I am walking");
	}
}
class Bird extends Animal{
	void fly(){
		System.out.println("I am flying");
	}
    void sing(){
        System.out.println("I am singing");
    }
}

public class Solution{

   public static void main(String args[]){

	  Bird bird = new Bird();
	  bird.walk();
	  bird.fly();
      bird.sing();
	
   }
}
