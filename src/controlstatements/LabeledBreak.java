package controlstatements;

public class LabeledBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first: for (int i = 1; i <= 5; i++) {
			second: for (int j = 1; j <= 5; j++) {
				third: for (int k = 1; k <= 5; k++) {
					System.out.println(k);
					if (k == 2) {
						System.out.println("Break occured. Will comeout of all loops!");
						break first;
					}
				}
			}
		}
	}

}
