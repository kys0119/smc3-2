import java.util.Scanner;

public class Prob_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("수학, 과학, 영어순으로 3개의 과복별 점수 입력 : ");
		
		Grade me = new Grade();
		me.math = scan.nextInt();
		me.science = scan.nextInt();
		me.english = scan.nextInt();
		
		System.out.println("평균은" + me.average());
	
	}
}
class Grade{
	int math;
	int science;
	int english;
	public int average() {
		int sum = math + science + english;
		return sum/3;
		
	}
}