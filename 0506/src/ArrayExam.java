import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int max=0;
		int num=0;
		int i=0;
		int arr[] = new int[5];	
		for(i=0 ;i<5;i++){
			System.out.println(i+1+"번 입력 : ");
			arr[i] = scan.nextInt();
			
			if(max<=arr[i]){
				max=arr[i];
				num=i;
			}
		
		}
		
		System.out.println("가장 큰수 는"+(num+1)+"번쨰 숫자인"+max);
	
	}

}