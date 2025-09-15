class Pattern23 {
	public static void main(String[] args) {

		char c = 'Z';

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {

				if (j <= i) {
					System.out.print(c + " ");
					c--;
				}
			}
			System.out.println();

		}
	}
}