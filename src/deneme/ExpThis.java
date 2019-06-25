package deneme;

public class ExpThis {
//	static String name;
//	static String lastName;
//	static int age;
	
	ExpThis(){
		this("a");
		System.out.println("Kemal");
	}
	ExpThis(String name){
		this("a","b");
		System.out.println("Zulal");
	}
	ExpThis(String name,String lastName){
		this("a","b",2);
		
		System.out.println("meral");
		
	}
	ExpThis(String name,String lastName,int age) {
		
		System.out.println(name+" "+lastName+" "+age);
	}
	
		public static void main(String[]ags) {
		ExpThis obj=new ExpThis();
		
	}

}
