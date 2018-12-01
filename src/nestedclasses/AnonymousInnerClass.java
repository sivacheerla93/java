package nestedclasses;

interface Stack {
	void push(String value);

	String pop();
}

class AnonymousInnerClass {
	public Stack getStack() {
		return new Stack() {

			@Override
			public void push(String value) {
				// TODO Auto-generated method stub

			}

			@Override
			public String pop() {
				// TODO Auto-generated method stub
				return null;
			}

		};
	}
}
