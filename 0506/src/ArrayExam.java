import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int max=0;
		int num=0;
		int i=0;
		int arr[] = new int[5];	
		for(i=0 ;i<5;i++){
			System.out.println(i+1+"�� �Է� : ");
			arr[i] = scan.nextInt();
			
			if(max<=arr[i]){
				max=arr[i];
				num=i;
			}
		
		}
		
		System.out.println("���� ū�� ��"+(num+1)+"���� ������"+max);
	
	}

}