import java.util.*;
public class Game {
	public static void main(String[] args) {
		
		int user=0;
		int com=(int)(Math.random()*3); 
		Scanner scan=new Scanner(System.in);
		System.out.println("[1: 가위 2:바위 3:보]");
		user=scan.nextInt();

		switch (com) {
		case 1:
			switch(user)
			{
			case 1:
				System.out.println("[나: 가위] VS [컴퓨터: 가위]");
				System.out.println("무승부");
				break;
			case 2:
				System.out.println("[나: 바위] VS [컴퓨터: 가위]");
				System.out.println("이겼습니다");
				break;
			case 3:
				System.out.println("[나: 보] VS [컴퓨터: 가위]");
				System.out.println("졌습니다");
				break;
			}
			break;
        case 2:
        	switch(user)
			{
			case 1:
				System.out.println("[나: 가위] VS [컴퓨터: 바위]");
				System.out.println("졌습니다");
				break;
			case 2:
				System.out.println("[나: 바위] VS [컴퓨터: 바위]");
				System.out.println("무승부");
				break;
			case 3:
				System.out.println("[나: 보] VS [컴퓨터: 바위]");
				System.out.println("이겼습니다");
			}
			break;	
        case 3:
        	switch(user)
			{
			case 1:
				System.out.println("[나: 가위] VS [컴퓨터: 보]");
				System.out.println("이겼습니다");
				break;
			case 2:
				System.out.println("[나: 바위] VS [컴퓨터: 보]");
				System.out.println("졌습니다");
				break;
			case 3:
				System.out.println("[나: 보] VS [컴퓨터: 보]");
				System.out.println("무승부");
			}
			break;	
		default:
			System.out.println("");
			break;
		}
        	}
	}
