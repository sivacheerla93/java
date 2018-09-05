package interfaces;

@FunctionalInterface
public interface Printable {

	void print(String msg);

	default String newline() {
		return "\n";
	}
}
