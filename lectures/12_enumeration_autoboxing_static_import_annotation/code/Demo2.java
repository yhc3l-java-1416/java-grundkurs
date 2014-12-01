class Demo2 {
	public static void main(String[] args){
		Transport tp;
		System.out.println("A car can travel at " + Transport.CAR.getSpeed() + "mph.");

		System.out.println("All transport speeds: ");
		for(Transport t: Transport.values()){
			System.out.println(t + " typical speed is " + t.getSpeed() + "mph.");
		}
	}
}