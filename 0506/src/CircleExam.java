import java.util.Scanner;
public class CircleManager {
	public static void main(String args[]) {
		 Scanner scan = new Scanner(System.in) ;// ��ĳ�� ��ü ����

		 System.out.print("������ �� >>");
            // �Է¹��� ������ �� radius ������ �ֱ�
		 int radius = scan.nextInt();
		 Circle c = new Circle(radius); //  Circle Ŭ������ ���� ��ü c����
 
		 System.out.println("������ "+ radius + "�� ���� ���̴� " + c.Area() + "�̴�.");  
	}
}

class Circle{
	int radius;
	public Circle(int radius) { 
		this.radius=radius;
		// ������(radius) �� �ʱ�ȭ

	}
	public double Area() { // ���� ���� return (���� ���� = ������*������*3.14)
		
		return radius*radius*3.14;
		// ���� ���� return (���� ���� = ������*������*3.14)
	}
}