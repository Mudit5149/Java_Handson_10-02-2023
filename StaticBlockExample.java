package staticexample;

public class StaticBlockExample {
	
	public static void main(String[] args) {
		System.out.println("this statement is executed before the static block");
	}
	
	
	
	static  {
		System.out.println("Static block 1");
		
	}
	
	static  {
		System.out.println("Static block 2");
	}
	
	
	static  {
		System.out.println("Static block 0");
		
}
}
