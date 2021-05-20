
public class Car {
	String color;
	int speed;
	
	public int upspeed(int speed){
		this.speed += speed;
		return this.speed;
	}
	public int downspeed(int speed){
		 this.speed -= speed;
		 return this.speed;
		 
	}
}

class Sedan extends Car {
	int seat;
	public int seatnum(int seat){
		this.seat = seat;
		return seat;
		
	}
}
class Truck extends Car {
	int weight;
	public int ton(int weight){
		this.weight = weight;
		return weight;
		
		
	}
}

public class ex01{
	public static void main(String[] args) {
		Sedan s = new Sedan();
		Truck t = new Truck();
		
	}
}
