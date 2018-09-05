package interfaces;

class MyStack implements Stack {

	private String a[] = new String[10];
	private int top = 0;

	@Override
	public void push(String value) {
		// TODO Auto-generated method stub
		a[top] = value;
		top++;
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		top--;
		return a[top];
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return top;
	}

	public void print() {
		for (int i = 0; i < top; i++) {
			System.out.println(a[i]);
		}
	}

}
