package deneme;

public class deneme {
	deneme() {
		System.out.println("I am constructor of parent class");
	}

	deneme(int a) {
		System.out.println("I am constructor of parent class");
	}

	deneme(String a) {
		System.out.println("I am constructor of parent class");
	}

	public void display() {
		System.out.println("I am method of parent class");
	}
}
	 class child extends deneme {
		child() {
			super();
		}

		child(int a) {
			super(a);
		}

		public void show() {
			System.out.println("I am method of child class");
		}

		public static void main(String[] args) {
			child obj = new child();
			
			
		}
	
	}

