import java.util.Scanner;

public class Prob_2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("1000 이하의 자연수를 입력하세요.");
		int num1 = scan.nextInt();
		int i = 0;
		int sum = 0;
		
		while(i<=num1) {
			if(i > 0 && i % 4 == 0) {
				sum = num1+i;
						System.out.println(i);
			}
			i++;
		}
		sum = sum + num1;
		System.out.println("1~"+num1+"까지 4의 배수의 합은 "+sum+"입니다.");

	}

}
