class Demo1 {
	public static void main(String[] args){
		Day today = Day.MONDAY;
		if(today == Day.MONDAY){
			System.out.println("Wakeeee, Wakeee time to get up");
		}
		switch(today){
			case MONDAY:
				System.out.println("The week starts here");
				break;
			case FRIDAY:
				System.out.println("The end of the week");
				break;
			default:
				System.out.println("Same old Same oh");
		}

		today = Day.MONDAY;
		System.out.println(today.ordinal());
	}
}