class LifeOnEarth {
	public static void main(String[] args)
	throws java.lang.InterruptedException{
		// Create a matrix of 25 by 25 cells.
		// Place out at random some starting cells.
		Life earth = new Life(25);
		// Display the matrix in terminal so we can see which cells are alive. 
		earth.drawWorld();
		// Endless loop that keeps calculating and displaying new generations of life.
		while(true){
			Thread.sleep(200);
			earth.nextGeneration();
			earth.drawWorld();
		}
	}
}