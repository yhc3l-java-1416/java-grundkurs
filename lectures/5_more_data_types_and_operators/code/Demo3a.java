class Demo3a {

	public static void main(String[] args) {
		int r, c;
		int table[][] = new int[4][5];
		for (r = 0; r < table.length; r++) {
			for (c = 0; c < table[r].length; c++) {
				table[r][c] = (r * 5) + (c + 1);
				System.out.print(table[r][c] + "\t");
			}
			System.out.println();
		}
	}

}
