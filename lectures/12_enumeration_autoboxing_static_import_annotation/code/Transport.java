enum Transport {
	CAR(65), TRUCK(55), AIRPLANE(600);
	private int speed;
	Transport(int s){
		speed = s;
	}

	int getSpeed(){
		return speed;
	}
}