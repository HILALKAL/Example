package com.Example;

public class Animal {

   String species;
   int age=6;
   boolean hasSketelon;
   boolean tail;

   Animal(){}  // non-return type method.--->constructor
   Animal(String a, int b, boolean t, boolean h ){
       species=a;
       age=b;
       tail=t;
       hasSketelon=h;
       
   }

   void canEat() {
       System.out.println("Animal can eat");
       
   }
   boolean canMove() {
       return true;
   }
   void Print() {
       System.out.println(species+" "+age+" "+tail+" "+hasSketelon);
   }
}

    class Vertebrates extends Animal{
	Vertebrates(){
		
	}
	Vertebrates(String a, int b, boolean t ){
		species=a;
	       age=b;
	       tail=t;
	       
	}
    int numberOfLeg;
    @Override
    void canEat() {
        System.out.println("Vertebrates can not eat");
    }
    void  canFertile() {
        System.out.println("Vertebrates can fertile");
    }
    }
class 
Mammals extends Vertebrates{
    
    @Override
    boolean canMove() {
        
        return false;//
        
    }
    
    
}
