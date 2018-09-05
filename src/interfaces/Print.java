package interfaces;

class Print implements Printable {

	@Override
	public void print(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg + newline());
	}
}