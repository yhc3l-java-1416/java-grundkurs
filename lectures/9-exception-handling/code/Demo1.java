class Demo1 {
	static int[] nums = new int[4];
	public static void main(String[] args){
		//doStuff();
		try {
			printMessage("Hello");
			printMessage("Tom");
			printMessage(null);
		} catch(NullPointerException e){
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch(Exception e){
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void printMessage(String message){
		if(message == null){
			throw new NullPointerException("printMessage can't print null values");
		} else {
			System.out.println(message);
		}
	}

}