class Life {
	boolean[][] matrix;
	
	Life(int size){
		// Create a matrix of a certain size.
		matrix = new boolean[size][size];
		// Place out at random some starting cells.	
		for(int rows = 0; rows < size; rows++){
			for(int cols = 0; cols < size; cols++){
				matrix[rows][cols] = (Math.random() < 0.3);
			}
		}
	}

	// Display the matrix in terminal so we can see which cells are alive. 
	public void drawWorld(){
		// Clear screen
		System.out.print("\033[H\033[2J");
		for(int rows = 0; rows < matrix.length; rows++){
			for(int cols = 0; cols < matrix[rows].length; cols++){
				System.out.print( (matrix[rows][cols]) ? "@" : ".");
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	// Calculate the nextGeneration based on the current matrix and update the matrix.
	public void nextGeneration(){
		boolean[][] nextMatrix = new boolean[matrix.length][matrix.length];
		for(int rows = 0; rows <  nextMatrix.length; rows++){
			for(int cols = 0; cols <  nextMatrix[rows].length; cols++){
				nextMatrix[rows][cols] = isAlive(rows, cols);
			}
		}
		matrix = nextMatrix;
	}

	// Any live cell with fewer than two neighbours dies.
	// Any live cell with more than 3 live neighbours dies.
	// Any live cell with 2 or 3 live neighbours survives.
	// Any dead cell with exactly 3 live neighbours comes to life.
	private boolean isAlive(int row, int col){
		int liveCount = countLiveNeighbours(row, col);
		boolean isCurrentlyAlive = matrix[row][col];
		// The games rules
		if(liveCount == 3){
			return true;
		} else if(liveCount == 2 && isCurrentlyAlive){
			return true;
		} else {
			return false;
		}
	}

	private int countLiveNeighbours(int row, int col){
		// Count live cells
		int liveCount = 0;
		boolean isCurrentlyAlive = matrix[row][col];
		// Loop through surrounding rows
		for(int r = -1; r <= 1; r++){
			int currentRow = row + r;
			// Ensure the currentRow is not outside of our matrix.
			currentRow = (currentRow < 0)? matrix.length - 1: currentRow;
			currentRow = (currentRow == matrix.length) ? 0: currentRow; 
			// Loop through surroundings cols in each surrounding row.
			for(int c = -1; c <= 1; c++){
				int currentCol = col + c;
				// Ensure the currentCol is not outside of our matrix.
				currentCol = (currentCol < 0)? matrix.length - 1: currentCol;
				currentCol = (currentCol == matrix.length) ? 0: currentCol;
				// Add 1 to live count if the cell is alive
				liveCount = (matrix[currentRow][currentCol])? liveCount + 1: liveCount;
			}
		}

		// Since liveCount includes the cell we are interested in which is not a 
		// neighbour we must subtract 1 if the cell we are interested in is alive. 
		if(isCurrentlyAlive){
			liveCount--;
		}
		return liveCount;
	}
}