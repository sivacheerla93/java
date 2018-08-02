package oops.initializationblocks;

// static blocks are loaded & calls automatically when class loads in the memory
// no need to create object for static blocks
// Object init block calls when object is created

public class InitDemo {
	public static void main(String args[]) {
		B obj = new B();
	}
}

class A {
	static {
		System.out.println("Static Init A");
	}
	{
		System.out.println("Init A");
	}

	public A() {
		System.out.println("Constructor block of A");
	}
}

class B extends A {
	static {
		System.out.println("Static Init B");
	}
	{
		System.out.println("Init B");
	}

	public B() {
		System.out.println("Constructor block of InitDemo");
	}
}
