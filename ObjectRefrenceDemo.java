package nonStaticMembers;

public class ObjectRefrenceDemo {
	
	int x;
	ObjectRefrenceDemo(){
		
	}

	public static void main(String[] args) {
		ObjectRefrenceDemo d = new ObjectRefrenceDemo();
		System.out.println(d.x);

	}

}
