package com.Example;

public class TestAnimals {

	public static void main(String[] args) {
		
 Mammals obj=new Mammals(); 
	obj.Print();
	obj.canMove();
	
 Animal obj1=new Animal("kuslar",6,true,true);
    obj1.Print();
    
 Animal obj3=new Vertebrates();
  	obj3.canEat();
  	System.out.println(obj3.canMove());
  	
 Animal  obj4=new Mammals();
   System.out.println( obj4.canMove());
   obj4.canEat();
   
 Animal obj5=new Animal();
   obj5.canEat();
   
 Vertebrates obj6=new Vertebrates("kurbagalar",3,true);
   obj6.Print();
   
	}

}
