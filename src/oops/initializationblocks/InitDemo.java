package oops.initializationblocks;

// static blocks are loaded & calls automatically when class loads in the memory
// no need to create object for static blocks
// Object init block calls when object is created
class A {
	static {
		System.out.println("Static Init A");
	}
	{
		System.out.println("Init A");
	}
}

class InitDemo extends A {
	static {
		System.out.println("Static Init B");
	}
	{
		System.out.println("Init B");
	}

	public static void main(String args[]) {
		InitDemo obj = new InitDemo();
	}
}
