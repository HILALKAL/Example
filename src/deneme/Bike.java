package deneme;

 interface vehicle {
	
	 int wheel=4;
	 
	void changeGear(int a);
	void speedUp(int a);
	void applyBrakes(int a);
}
 interface aaaa{
	 void bbbbb(int b);
 }

public class Bike implements vehicle,aaaa{//

	@Override
	public void changeGear(int a) {
	
		System.out.println(a);
		
	}

	@Override
	public void speedUp(int a) {
	System.out.println(a);	
		
	}

	@Override
	public void applyBrakes(int a) {
		System.out.println(a);
		
	}
	public static void main(String[]args) {
		vehicle obj=new Bike();
		obj.applyBrakes(2);
		obj.speedUp(3);
		obj.changeGear(6);
		
		aaaa obj1=new Bike();
		obj1.bbbbb(4);
	 }

	@Override
	public void bbbbb(int b) {
		System.out.println(b);
		
	}	
	
}
class MotorClass implements vehicle{

	@Override
	public void changeGear(int a) {
		
		System.out.println(8);
	}

	@Override
	public void speedUp(int a) {
		System.out.println(120);
		
	}

	@Override
	public void applyBrakes(int a) {
		System.out.println(2);
		
	}
	


}