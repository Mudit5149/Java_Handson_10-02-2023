package staticexample;

public class StaticMethodsDemo {

	public static void main(String[] args) {
		System.out.println("inside main");
		StaticMethodsDemo.method1();
		
	}
	
	static void method1() {
		System.out.println("inside Method 1");
	}
	
	static {
		
		System.out.println("Inside the Static block");
	}

}
