import java.util.Scanner;

class Car{
	String color;
	int speed=100;
	
	public int upspeed(int speed){
		return this.speed += 100;
	}
	
	public int downspeed(int speed){
		return this.speed += speed;
	}
}
//////////////////////////////////////////////////////////////////////////////////////////
class Sedan extends Car{
	int seat;
	
	public Sedan(int seat){
		this.seat = seat;
	}
	
	public int seatnum(){
		return seat;
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////
class Truck extends Car{
	int weight;
	
	public Truck(int weight){
		this.weight = weight;
	}
	
	public int weightnum(){
		return weight;
	}
}
///////////////////////////////////////////////////////////////////////////////////////////////
public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Sedan car1 = new Sedan(5);
		Truck car2 = new Truck(50);
		
		System.out.println("�¿��� �ӵ� : " + car1.speed + "�¼� ���� " + car1.seatnum() + "�Դϴ�.");
		System.out.println("Ʈ�� �ӵ� : " + car2.speed + "���緮�� " + car2.weightnum() + "�Դϴ�.");
		
		

	}

}
